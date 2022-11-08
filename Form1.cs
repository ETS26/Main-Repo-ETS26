using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        int sayi1, sayi2;
        char islem;
        float sonuc;

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            sayi1 = int.Parse(textBox1.Text);
            sayi2 = int.Parse(textBox2.Text);
            islem = char.Parse(textBox3.Text);
            switch (islem)
            {
                case '+':
                    sonuc = sayi1 + sayi2;
                    label6.Text = sonuc.ToString();
                    break;
                case '-':
                    sonuc = sayi1 - sayi2;
                    label6.Text = sonuc.ToString();
                    break;
                case '*':
                    sonuc = sayi1 * sayi2;
                    label6.Text = sonuc.ToString();
                    break;
                case '/':
                    sonuc = sayi1 / sayi2;
                    label6.Text = sonuc.ToString();
                    break;
                default:
                    label6.Text = "Hatalı işlem seçtiniz";
                    break;
            }

            }
    }
}
