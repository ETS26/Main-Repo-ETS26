namespace Newham_College_London_Project
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.workhour = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.hourlywage = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.ovetimepay = new System.Windows.Forms.TextBox();
            this.grosspay = new System.Windows.Forms.TextBox();
            this.national_ins = new System.Windows.Forms.TextBox();
            this.pens_cont = new System.Windows.Forms.TextBox();
            this.netpay = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.taxpay = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.full_name = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.delete = new System.Windows.Forms.Button();
            this.refresh = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.tabPage2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // comboBox1
            // 
            this.comboBox1.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.comboBox1.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Items.AddRange(new object[] {
            "Manegement Staff (Category M)",
            "Teaching Staff (Category L)",
            "Administrative Staff (Category A)"});
            this.comboBox1.Location = new System.Drawing.Point(997, 40);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(260, 34);
            this.comboBox1.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label1.Location = new System.Drawing.Point(838, 43);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(131, 26);
            this.label1.TabIndex = 2;
            this.label1.Text = "PERSONEL:";
            // 
            // workhour
            // 
            this.workhour.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.workhour.Location = new System.Drawing.Point(367, 103);
            this.workhour.Name = "workhour";
            this.workhour.Size = new System.Drawing.Size(260, 34);
            this.workhour.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label2.Location = new System.Drawing.Point(122, 106);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(208, 26);
            this.label2.TabIndex = 2;
            this.label2.Text = "WORKİNG HOURS:";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // hourlywage
            // 
            this.hourlywage.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.hourlywage.Location = new System.Drawing.Point(997, 103);
            this.hourlywage.Name = "hourlywage";
            this.hourlywage.Size = new System.Drawing.Size(260, 34);
            this.hourlywage.TabIndex = 3;
            this.hourlywage.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label3.Location = new System.Drawing.Point(794, 106);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(175, 26);
            this.label3.TabIndex = 2;
            this.label3.Text = "HOURLY WAGE:";
            this.label3.Click += new System.EventHandler(this.label2_Click);
            // 
            // ovetimepay
            // 
            this.ovetimepay.Enabled = false;
            this.ovetimepay.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.ovetimepay.Location = new System.Drawing.Point(367, 229);
            this.ovetimepay.Name = "ovetimepay";
            this.ovetimepay.Size = new System.Drawing.Size(260, 34);
            this.ovetimepay.TabIndex = 3;
            this.ovetimepay.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // grosspay
            // 
            this.grosspay.Enabled = false;
            this.grosspay.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.grosspay.Location = new System.Drawing.Point(367, 289);
            this.grosspay.Name = "grosspay";
            this.grosspay.Size = new System.Drawing.Size(260, 34);
            this.grosspay.TabIndex = 3;
            this.grosspay.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // national_ins
            // 
            this.national_ins.Enabled = false;
            this.national_ins.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.national_ins.Location = new System.Drawing.Point(997, 165);
            this.national_ins.Name = "national_ins";
            this.national_ins.Size = new System.Drawing.Size(260, 34);
            this.national_ins.TabIndex = 3;
            this.national_ins.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // pens_cont
            // 
            this.pens_cont.Enabled = false;
            this.pens_cont.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.pens_cont.Location = new System.Drawing.Point(367, 165);
            this.pens_cont.Name = "pens_cont";
            this.pens_cont.Size = new System.Drawing.Size(260, 34);
            this.pens_cont.TabIndex = 3;
            this.pens_cont.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // netpay
            // 
            this.netpay.Enabled = false;
            this.netpay.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.netpay.Location = new System.Drawing.Point(997, 289);
            this.netpay.Name = "netpay";
            this.netpay.Size = new System.Drawing.Size(260, 34);
            this.netpay.TabIndex = 3;
            this.netpay.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label4.Location = new System.Drawing.Point(151, 232);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(177, 26);
            this.label4.TabIndex = 2;
            this.label4.Text = "OVERTİME PAY:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label5.Location = new System.Drawing.Point(191, 292);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(137, 26);
            this.label5.TabIndex = 2;
            this.label5.Text = "GROSS PAY:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label6.Location = new System.Drawing.Point(706, 168);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(263, 26);
            this.label6.TabIndex = 2;
            this.label6.Text = "NATIONAL INSURANCE:";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label7.Location = new System.Drawing.Point(41, 168);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(289, 26);
            this.label7.TabIndex = 2;
            this.label7.Text = "PENSİON CONTRİBUTİON:";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label8.Location = new System.Drawing.Point(861, 292);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(106, 26);
            this.label8.TabIndex = 2;
            this.label8.Text = "NET PAY:";
            // 
            // taxpay
            // 
            this.taxpay.Enabled = false;
            this.taxpay.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.taxpay.Location = new System.Drawing.Point(997, 229);
            this.taxpay.Name = "taxpay";
            this.taxpay.Size = new System.Drawing.Size(260, 34);
            this.taxpay.TabIndex = 3;
            this.taxpay.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label9.Location = new System.Drawing.Point(860, 232);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(107, 26);
            this.label9.TabIndex = 2;
            this.label9.Text = "TAX PAY:";
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Times New Roman", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.button1.Location = new System.Drawing.Point(656, 378);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(150, 60);
            this.button1.TabIndex = 4;
            this.button1.Text = "CALCULATE";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Times New Roman", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.button2.Location = new System.Drawing.Point(881, 378);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(150, 60);
            this.button2.TabIndex = 4;
            this.button2.Text = "SAVE";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Font = new System.Drawing.Font("Times New Roman", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.button3.Location = new System.Drawing.Point(431, 378);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(150, 60);
            this.button3.TabIndex = 4;
            this.button3.Text = "CLEAR";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Font = new System.Drawing.Font("Times New Roman", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.tabControl1.Location = new System.Drawing.Point(1, 1);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(1462, 515);
            this.tabControl1.TabIndex = 5;
            // 
            // tabPage1
            // 
            this.tabPage1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.tabPage1.Controls.Add(this.full_name);
            this.tabPage1.Controls.Add(this.label10);
            this.tabPage1.Controls.Add(this.button2);
            this.tabPage1.Controls.Add(this.button3);
            this.tabPage1.Controls.Add(this.comboBox1);
            this.tabPage1.Controls.Add(this.label1);
            this.tabPage1.Controls.Add(this.button1);
            this.tabPage1.Controls.Add(this.label4);
            this.tabPage1.Controls.Add(this.netpay);
            this.tabPage1.Controls.Add(this.label5);
            this.tabPage1.Controls.Add(this.taxpay);
            this.tabPage1.Controls.Add(this.label6);
            this.tabPage1.Controls.Add(this.pens_cont);
            this.tabPage1.Controls.Add(this.label7);
            this.tabPage1.Controls.Add(this.national_ins);
            this.tabPage1.Controls.Add(this.label9);
            this.tabPage1.Controls.Add(this.grosspay);
            this.tabPage1.Controls.Add(this.label8);
            this.tabPage1.Controls.Add(this.ovetimepay);
            this.tabPage1.Controls.Add(this.label2);
            this.tabPage1.Controls.Add(this.hourlywage);
            this.tabPage1.Controls.Add(this.label3);
            this.tabPage1.Controls.Add(this.workhour);
            this.tabPage1.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.tabPage1.Location = new System.Drawing.Point(4, 29);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(1454, 482);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "MAİN PAGE";
            // 
            // full_name
            // 
            this.full_name.Location = new System.Drawing.Point(367, 40);
            this.full_name.Name = "full_name";
            this.full_name.Size = new System.Drawing.Size(260, 34);
            this.full_name.TabIndex = 6;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(189, 43);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(141, 26);
            this.label10.TabIndex = 5;
            this.label10.Text = "FULL NAME:";
            // 
            // tabPage2
            // 
            this.tabPage2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.tabPage2.Controls.Add(this.delete);
            this.tabPage2.Controls.Add(this.refresh);
            this.tabPage2.Controls.Add(this.dataGridView1);
            this.tabPage2.Location = new System.Drawing.Point(4, 29);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(1454, 482);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "RECORDS";
            // 
            // delete
            // 
            this.delete.Location = new System.Drawing.Point(779, 429);
            this.delete.Name = "delete";
            this.delete.Size = new System.Drawing.Size(251, 42);
            this.delete.TabIndex = 1;
            this.delete.Text = "DELETE";
            this.delete.UseVisualStyleBackColor = true;
            this.delete.Click += new System.EventHandler(this.delete_Click);
            // 
            // refresh
            // 
            this.refresh.Location = new System.Drawing.Point(415, 429);
            this.refresh.Name = "refresh";
            this.refresh.Size = new System.Drawing.Size(251, 42);
            this.refresh.TabIndex = 1;
            this.refresh.Text = "REFRESH";
            this.refresh.UseVisualStyleBackColor = true;
            this.refresh.Click += new System.EventHandler(this.refresh_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(12, 18);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 51;
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(1431, 399);
            this.dataGridView1.TabIndex = 0;
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(1460, 517);
            this.Controls.Add(this.tabControl1);
            this.Font = new System.Drawing.Font("Times New Roman", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.Name = "Form2";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form2";
            this.Load += new System.EventHandler(this.Form2_Load);
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage1.PerformLayout();
            this.tabPage2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox workhour;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox hourlywage;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox ovetimepay;
        private System.Windows.Forms.TextBox grosspay;
        private System.Windows.Forms.TextBox national_ins;
        private System.Windows.Forms.TextBox pens_cont;
        private System.Windows.Forms.TextBox netpay;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox taxpay;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.BindingSource usersDataSetBindingSource;
        private System.Windows.Forms.TextBox full_name;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Button delete;
        private System.Windows.Forms.Button refresh;
    }
}