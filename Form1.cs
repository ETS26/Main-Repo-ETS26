using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data;
using System.Data.OleDb;
using System.IO;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        OleDbConnection bag = new OleDbConnection();
        OleDbCommand kom = new OleDbCommand();
        OleDbDataReader oku;
        OleDbDataAdapter adb = new OleDbDataAdapter();
        DataSet ds = new DataSet();
        string resmin_adi = "", dosya_yolu = "";
        void baglan()
        {
            bag.ConnectionString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" + Application.StartupPath + "/data.accdb";
            if (bag.State == ConnectionState.Closed) bag.Open();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            if(openFileDialog1.ShowDialog()==DialogResult.OK)
            {
                dosya_yolu = openFileDialog1.FileName;
                pictureBox2.ImageLocation = dosya_yolu;
                resmin_adi = Path.GetFileName(dosya_yolu);
                MessageBox.Show("dosya adı=" + resmin_adi + "\n Dosya Yolu=" + dosya_yolu);
            }
        }
        void doldur()
        {
            ds.Clear();
            kom.Parameters.Clear();
            kom.CommandText = "select * from galeri";
            kom.Connection = bag;
            adb.SelectCommand = kom;
            adb.Fill(ds,"mm");
            dataGridView1.DataSource = ds.Tables["mm"];
        }
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void dataGridView1_CellDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            int s = e.RowIndex;
            textBox4.Text= dataGridView1.Rows[s].Cells[1].Value.ToString();
            textBox5.Text = dataGridView1.Rows[s].Cells[2].Value.ToString();
            textBox6.Text = dataGridView1.Rows[s].Cells[3].Value.ToString();
            textBox7.Text = dataGridView1.Rows[s].Cells[4].Value.ToString();
            textBox8.Text = dataGridView1.Rows[s].Cells[5].Value.ToString();
            pictureBox3.ImageLocation = Application.StartupPath + "\\resim\\"+
            dataGridView1.Rows[s].Cells[6].Value.ToString();
            id = int.Parse(dataGridView1.Rows[s].Cells[0].Value.ToString());
            resmin_adi= dataGridView1.Rows[s].Cells[6].Value.ToString();

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            baglan();
            doldur();
            bag.Close();
            label1.Visible = false;
            textBox1.Visible = false;
            label2.Visible = false;
            textBox2.Visible = false;
            label3.Visible = false;
            textBox3.Visible = false;
            button1.Visible = false;
            comboBox1.Text = "Marka seçiniz";
            comboBox2.Text = "Model seçiniz";
            baglan();
            kom.Parameters.Clear();
            kom.Connection = bag;
            kom.CommandText = "select distinct marka from galeri";
            oku = kom.ExecuteReader();
            while(oku.Read())
            {
                comboBox1.Items.Add(oku[0]);
            }
            oku.Close();
            bag.Close();

           
           

        }
        int id;
        private void button2_Click(object sender, EventArgs e)
        {
            
            baglan();
            kom.Parameters.Clear();
            kom.CommandText = "delete from galeri where id=@1;";
            kom.Connection = bag;
            kom.Parameters.AddWithValue("@1", id);
            if (kom.ExecuteNonQuery() > 0) MessageBox.Show("araç satıldı");
            doldur();
            bag.Close();
            textBox4.Text = "";
            textBox5.Text = "";
            textBox6.Text = "";
            textBox7.Text = "";
            textBox8.Text = "";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            baglan();
            kom.Parameters.Clear();
            kom.CommandText = "update  galeri set marka=@1,model=@2,modelyili=@3,renk=@4,fiyat=@5,resim=@6 where id=@7";
            kom.Connection = bag;
            kom.Parameters.AddWithValue("@1", textBox4.Text);
            kom.Parameters.AddWithValue("@2", textBox5.Text);
            kom.Parameters.AddWithValue("@3", textBox6.Text);
            kom.Parameters.AddWithValue("@4", textBox7.Text);
            kom.Parameters.AddWithValue("@5", textBox8.Text);
            kom.Parameters.AddWithValue("@6", resmin_adi);
            kom.Parameters.AddWithValue("@7", id);
            if (kom.ExecuteNonQuery() > 0) MessageBox.Show("kayıtlar güncellendi");
            doldur();
            resmin_adi = "";
            dosya_yolu = "";
            bag.Close();
        }
        bool kayıt = false;
        private void button4_Click(object sender, EventArgs e)
        {
            baglan();
            try
            {
                if (resmin_adi == "")
                {
                    pictureBox2.ImageLocation = Application.StartupPath + "\\resim\\noimage.jpg";
                    resmin_adi = "noimage.jpg";
                    DialogResult sor = MessageBox.Show("Resim seçmediniz\n yine de kaydetmek istiyor musunuz?", "RESİM SEÇİLMEDİ", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                    if (sor == DialogResult.Yes)
                        kayıt = true;
                    else
                    {
                        kayıt = false;
                    }
                }
                else kayıt = true;
                if(kayıt == true)
                {     kom.Parameters.Clear();
                            kom.CommandText = "insert into galeri(marka,model,modelyili,renk,fiyat,resim)values(@1,@2,@3,@4,@5,@6)";
                            kom.Connection = bag;
                            kom.Parameters.AddWithValue("@1", comboBox1.Text);
                            kom.Parameters.AddWithValue("@2", comboBox2.Text);
                            kom.Parameters.AddWithValue("@3", int.Parse(comboBox3.Text));
                            kom.Parameters.AddWithValue("@4", comboBox4.Text);
                            kom.Parameters.AddWithValue("@5", double.Parse(textBox9.Text));
                            kom.Parameters.AddWithValue("@6", resmin_adi);

                            if (kom.ExecuteNonQuery() > 0) MessageBox.Show("kayıtlar eklendi");
                            doldur();

                        }
                        else MessageBox.Show("Kayıt işlemi iptal edildi"); 
                
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            bag.Close();
            comboBox1.Text = "";
            comboBox2.Text = "";
            comboBox3.Text = "";
            comboBox4.Text = "";
            textBox9.Text = "";
            
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            label3.Visible = true;
            textBox3.Visible = true;
            label1.Visible = false;
            textBox1.Visible = false;
            label2.Visible = false;
            textBox2.Visible = false;
            button1.Visible = true;

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            label1.Visible = true;
            textBox1.Visible = true;
            label2.Visible = true;
            textBox2.Visible = true;
            label3.Visible = false;
            textBox3.Visible = false;
            button1.Visible = true;
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            label1.Visible = true;
            textBox1.Visible = true;
            label2.Visible = true;
            textBox2.Visible = true;
            label3.Visible = false;
            textBox3.Visible = false;
            button1.Visible = true;
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                dosya_yolu = openFileDialog1.FileName;
                pictureBox3.ImageLocation = dosya_yolu;
                resmin_adi = Path.GetFileName(dosya_yolu);
                MessageBox.Show("dosya adı=" + resmin_adi + "\n Dosya Yolu=" + dosya_yolu);
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            comboBox2.Items.Clear();
            comboBox2.Text = "Model seçiniz";
            baglan();
            kom.Parameters.Clear();
            kom.Connection = bag;
            kom.CommandText = "select distinct model from galeri where marka=@1";
            kom.Parameters.AddWithValue("@1", comboBox1.Text);
            oku = kom.ExecuteReader();
            while (oku.Read())
            {
                comboBox2.Items.Add(oku[0]);
            }
            oku.Close();
            
            kom.Parameters.Clear();
            kom.Connection = bag;
            kom.CommandText = "select * from galeri where marka=@1";
            kom.Parameters.AddWithValue("@1", comboBox1.Text);
            ds.Clear();
            adb.SelectCommand = kom;
            adb.Fill(ds,"mm");
            dataGridView2.DataSource = ds.Tables["mm"];
            bag.Close();




        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            comboBox3.Items.Clear();
            comboBox3.Text = "model yılını seçiniz";
            
            baglan();
            try
            {
                ds.Clear();
                kom.Parameters.Clear();
                kom.Connection = bag;
                kom.CommandText = "select * from galeri where marka=@1 and model=@2 order by modelyili";
                kom.Parameters.AddWithValue("@1", comboBox1.Text);
                kom.Parameters.AddWithValue("@2", comboBox2.Text);
                adb.SelectCommand = kom;
                adb.Fill(ds,"mm");
                dataGridView2.DataSource = ds.Tables["mm"];


                kom.Parameters.Clear();
                kom.CommandText = "select modelyili from galeri where marka=@1 and model=@2 order by modelyili";
                kom.Parameters.AddWithValue("@1", comboBox1.Text);
                kom.Parameters.AddWithValue("@2", comboBox2.Text);
                oku = kom.ExecuteReader();
                while (oku.Read())
                {
                    comboBox3.Items.Add(oku[0]);
                }
                oku.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);

            }
            bag.Close();
            
        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {
            comboBox4.Items.Clear();
            comboBox4.Text = "renk seçiniz";

            baglan();
            try
            {
                ds.Clear();
                kom.Parameters.Clear();
                kom.Connection = bag;
                kom.CommandText = "select * from galeri where marka=@1 and model=@2 and modelyili=@3 order by renk ";
                kom.Parameters.AddWithValue("@1", comboBox1.Text);
                kom.Parameters.AddWithValue("@2", comboBox2.Text);
                kom.Parameters.AddWithValue("@3", comboBox3.Text);
                adb.SelectCommand = kom;
                adb.Fill(ds, "mm");
                dataGridView2.DataSource = ds.Tables["mm"];


                kom.Parameters.Clear();
                kom.CommandText = "select renk from galeri where marka=@1 and model=@2 and modelyili=@3 order by renk ";
                kom.Parameters.AddWithValue("@1", comboBox1.Text);
                kom.Parameters.AddWithValue("@2", comboBox2.Text);
                kom.Parameters.AddWithValue("@3", comboBox3.Text);
                oku = kom.ExecuteReader();
                while (oku.Read())
                {
                    comboBox4.Items.Add(oku[0]);
                }
                oku.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);

            }
            bag.Close();
        }
        int endusuk, enyuksek;

        private void comboBox4_SelectedIndexChanged(object sender, EventArgs e)
        {
            baglan();
            ds.Clear();
            kom.Parameters.Clear();
            kom.Connection = bag;
            kom.CommandText = "select * from galeri where marka=@1 and model=@2 and modelyili=@3 and renk=@4 order by fiyat ";
            kom.Parameters.AddWithValue("@1", comboBox1.Text);
            kom.Parameters.AddWithValue("@2", comboBox2.Text);
            kom.Parameters.AddWithValue("@3", comboBox3.Text);
            kom.Parameters.AddWithValue("@4", comboBox4.Text);
            adb.SelectCommand = kom;
            adb.Fill(ds, "mm");
            dataGridView2.DataSource = ds.Tables["mm"];
            bag.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ds.Clear();
            baglan();
            kom.Connection = bag;
            if (radioButton1.Checked)
            {
                kom.Parameters.Clear();
                kom.CommandText = "select * from galeri where model like '%'+@1+'%'";
                kom.Parameters.AddWithValue("@1", textBox3.Text);

            }
            else if (radioButton2.Checked)
            {   if (int.TryParse(textBox1.Text, out endusuk) && int.TryParse(textBox2.Text, out enyuksek))
                {
                    kom.Parameters.Clear();
                    kom.CommandText = "select * from galeri where modelyili>=@1 and modelyili<=@2";
                    kom.Parameters.AddWithValue("@1", endusuk);
                    kom.Parameters.AddWithValue("@2", enyuksek);
                }
                else
                {
                    MessageBox.Show("Sayısal değer girmeniz gerekli");
                    textBox1.Text = "";
                    textBox2.Text = "";
                    textBox1.Focus();
                }

            }
            else if (radioButton3.Checked)
            {
                if (int.TryParse(textBox1.Text, out endusuk) && int.TryParse(textBox2.Text, out enyuksek))
                {
                    kom.Parameters.Clear();
                    kom.CommandText = "select * from galeri where fiyat>=@1 and fiyat<=@2";
                    kom.Parameters.AddWithValue("@1", endusuk);
                    kom.Parameters.AddWithValue("@2", enyuksek);
                }
                else
                {
                    MessageBox.Show("Sayısal değer girmeniz gerekli");
                    textBox1.Text = "";
                    textBox2.Text = "";
                    textBox1.Focus();
                }

            }
            adb.SelectCommand = kom;
            adb.Fill(ds,"mm");
            dataGridView1.DataSource = ds.Tables["mm"];

               
                bag.Close();
            }
        }

       

        
            }

        

                
            
        

       

       
           
        

    



    

       
    

