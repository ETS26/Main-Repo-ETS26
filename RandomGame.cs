using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.VisualBasic;

namespace WindowsFormsApp4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        Random r = new Random();
        private void button1_Click(object sender, EventArgs e)
        {
            tahmin = r.Next(0, 100);
            MessageBox.Show(tahmin.ToString());
        }
        int sayı;
        int tahmin;
        int hak = 5 ;
        private void button2_Click(object sender, EventArgs e)
        {
            hak--;
            sayı = int.Parse(Interaction.InputBox("Bir Sayı Yaz", "Sayı Tahmini", "", 200, 200));
            
                if (sayı > tahmin)
            { MessageBox.Show("Aşağı"); }
            else if (sayı < tahmin)
            { MessageBox.Show("Yukarı"); }
            else if (sayı == tahmin)
            { MessageBox.Show("Tebrikler Doğru Tahmin"); Application.Exit(); }

            if (hak == 0)
            {
                MessageBox.Show("Hakkınız Bitti");
                Application.Exit();
            }
            else MessageBox.Show(hak + " Hakınız Kaldı");

            
                
        }

    }
}
