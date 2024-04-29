using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using MySql.Data.MySqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;
using System.Data.SqlClient;
using static Mysqlx.Expect.Open.Types;

namespace Newham_College_London_Project
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }
        MySqlConnection connection = new MySqlConnection("server=localhost;user=root;database=users;port=3306;password=;");
        double gross_pay; 
        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }
        private void button1_Click(object sender, EventArgs e)
        {
            double over_time_hour, over_time_pay, over_time, nationalins, pension, tax=0,net;
            double wh = double.Parse(workhour.Text);
            double hw = double.Parse(hourlywage.Text);

            if (comboBox1.SelectedIndex == 0)
            {
                    gross_pay = (wh * hw) * 4;
                    grosspay.Text = gross_pay.ToString();
                
            }
            else if (comboBox1.SelectedIndex == 1)
            {
                if (wh > 36)
                {
                    over_time_hour = wh - 36;
                    over_time_pay = hw * 1.5;
                    over_time = over_time_hour * over_time_pay;
                    ovetimepay.Text = over_time.ToString();
                    gross_pay = ((36 * hw) + over_time) * 4;
                    grosspay.Text = gross_pay.ToString();
                }
                else
                {
                    gross_pay = (wh * hw) * 4;
                    grosspay.Text = gross_pay.ToString();
                }
                

            }
            else if (comboBox1.SelectedIndex == 2)
            {
                if (wh > 40)
                {
                    over_time_hour = wh - 40;
                    over_time_pay = hw * 1.5;
                    over_time = over_time_hour * over_time_pay;
                    ovetimepay.Text = over_time.ToString();
                    gross_pay = ((40 * hw) + over_time) * 4;
                    grosspay.Text = gross_pay.ToString();
                }
                else
                {
                    gross_pay = (wh * hw) * 4;
                    grosspay.Text = gross_pay.ToString();
                }
            }
            nationalins = gross_pay * (9.6 / 100);
            national_ins.Text = nationalins.ToString();
            pension = gross_pay * 0.1;
            pens_cont.Text = pension.ToString();

            if (gross_pay > 12500 && gross_pay < 40000)
            {
                tax = gross_pay * 0.2;
                taxpay.Text = tax.ToString();
            }
            else if (gross_pay > 40000)
            {
                tax = gross_pay * 0.3;
                taxpay.Text = tax.ToString();
            }
            net = gross_pay - (nationalins + pension + tax);
            netpay.Text = net.ToString();
           
            
        }
        private void button3_Click(object sender, EventArgs e)
        {
            hourlywage.Clear();
            workhour.Clear();
            ovetimepay.Clear();
            grosspay.Clear();
            national_ins.Clear();
            taxpay.Clear();
            pens_cont.Clear();
            netpay.Clear();
        }
        public void dataref()
        {
            try
            {
                connection.Open();
                MySqlCommand command = new MySqlCommand("SELECT * FROM salaryinfo", connection);
                MySqlDataAdapter da = new MySqlDataAdapter(command);
                DataTable dt = new DataTable();
                da.Fill(dt);
                dataGridView1.DataSource = dt;
            }
            catch (Exception ex)
            {
                MessageBox.Show("An error occurred while loading data:" + ex.Message);
            }
            finally
            {
                connection.Close();
            }
        }
        private void Form2_Load(object sender, EventArgs e)
        {
            dataref();
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                connection.Open();
                MySqlCommand command = new MySqlCommand("insert into salaryinfo (p_fullname,p_staff,w_hours,h_wage,overtime_wage,gross_pay,national_ins,pension_cont,tax_pay,net_pay) values (@p_fullname,@p_staff,@w_hour,@h_wage,@overtime_pay,@gross_pay,@national_ins,@pension_cont,@tax_pay,@net_pay)", connection);
                command.Parameters.AddWithValue("@p_fullname", full_name.Text);
                command.Parameters.AddWithValue("@p_staff", comboBox1.Text);
                command.Parameters.AddWithValue("@w_hour", workhour.Text);
                command.Parameters.AddWithValue("@h_wage", hourlywage.Text);
                command.Parameters.AddWithValue("@overtime_pay", ovetimepay.Text);
                command.Parameters.AddWithValue("@gross_pay", grosspay.Text);
                command.Parameters.AddWithValue("@national_ins", national_ins.Text);
                command.Parameters.AddWithValue("@pension_cont", pens_cont.Text);
                command.Parameters.AddWithValue("@tax_pay", taxpay.Text);
                command.Parameters.AddWithValue("@net_pay", netpay.Text);
                command.ExecuteNonQuery();
                MessageBox.Show("Record added successfully!", "Successful", MessageBoxButtons.OK, MessageBoxIcon.Information);


            }
            catch (Exception ex)
            {
                MessageBox.Show("An error occurred while accessing the database: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            finally
            {
               
                connection.Close();

            }

        }

        private void refresh_Click(object sender, EventArgs e)
        {
            dataref();
        }
        public void del_record(int num)
        {   connection.Open();
            MySqlCommand com = new MySqlCommand("delete from salaryinfo where id=@id", connection);
            com.Parameters.AddWithValue("@id", num);
            com.ExecuteNonQuery();
            connection.Close();
        }
        private void delete_Click(object sender, EventArgs e)
        {
            foreach (DataGridViewRow drow in dataGridView1.SelectedRows)  
            {
                int num = Convert.ToInt32(drow.Cells[0].Value);
                del_record(num);
                MessageBox.Show("Record deleted successfully!", "Successful", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            dataref();
            

        }
    }
}
