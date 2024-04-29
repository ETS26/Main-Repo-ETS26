using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;


namespace Newham_College_London_Project
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void label1_Click(object sender, EventArgs e)
        {

        }
        MySqlConnection connection = new MySqlConnection("server=localhost;user=root;database=users;port=3306;password=;");
        private void Form1_Load(object sender, EventArgs e)
        {

            label3.Visible= false;
            textBox1.Visible= false;

        }
        public bool IsAllLetters(string text)
        {
            foreach (char c in text)
            {
                if (!char.IsLetter(c))
                {
                    return false;
                }
            }
            return true;
        }
       
        private void button1_Click(object sender, EventArgs e)
        {
            string fullname = textBox1.Text;
            string username = textBox2.Text;
            string password = textBox3.Text;
            if (textBox1.Visible == true)
            {
                
                if (string.IsNullOrWhiteSpace(fullname) || string.IsNullOrWhiteSpace(username) || string.IsNullOrWhiteSpace(password))
                {
                    MessageBox.Show("Please fill in all fields!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return; 
                }
                else if (!IsAllLetters(fullname.Replace(" ", "")))
                {
                    MessageBox.Show("Full Name must contain only letters!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return; 
                }
                
                else if (fullname.Length < 6 || fullname.Length > 64 || username.Length < 6 || username.Length > 64 || password.Length < 6 || password.Length > 64)
                {
                    MessageBox.Show("Each field must contain at least 6 and maximum 64 characters!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return; 
                }
                try
                {                   
                    connection.Open();
                    MySqlCommand command = new MySqlCommand("insert into personel (fullname,username,password) values (@fullname,@username,@password)",connection);
                    command.Parameters.AddWithValue("@fullname", textBox1.Text);
                    command.Parameters.AddWithValue("@username", textBox2.Text);
                    command.Parameters.AddWithValue("@password", textBox3.Text);
                    command.ExecuteNonQuery();
                    MessageBox.Show("User registered successfully!", "Successful", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    Form2 f2 = new Form2();
                    this.Hide();
                    f2.ShowDialog();
                    

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
            else
            {
                if (string.IsNullOrWhiteSpace(username) || string.IsNullOrWhiteSpace(password))
                {
                    MessageBox.Show("Please fill in all fields!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return; 
                }
                
                
                else if (username.Length < 6 || username.Length > 64 || password.Length < 6 || password.Length > 64)
                {
                    MessageBox.Show("Each field must contain at least 6 and maximum 64 characters!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return; 
                }

                try
                {
                        connection.Open();
                        string query = "SELECT COUNT(*) FROM personel WHERE username = @username AND password = @password";                        
                        using (MySqlCommand command = new MySqlCommand(query, connection))
                        {
                            command.Parameters.AddWithValue("@username", textBox2.Text);
                            command.Parameters.AddWithValue("@password", textBox3.Text);

                            
                            int count = Convert.ToInt32(command.ExecuteScalar());

                            if (count > 0)
                            {
                                MessageBox.Show("Login successful!", "Successful");
                                Form1_Load(null, null);
                                Form2 f2 = new Form2();
                                this.Hide();
                                f2.ShowDialog();
                            }
                            else
                            {
                                MessageBox.Show("Invalid username or password!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                            }
                        }
                    connection.Close();
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
        }

        private void rEGISTERToolStripMenuItem_Click(object sender, EventArgs e)
        {
            label3.Visible = true;
            textBox1.Visible = true;
            button1.Text = "REGISTER";
        }

        private void lOGINToolStripMenuItem_Click(object sender, EventArgs e)
        {
            label3.Visible = false;
            textBox1.Visible = false;
            button1.Text = "LOGIN";
        }
    }
}
