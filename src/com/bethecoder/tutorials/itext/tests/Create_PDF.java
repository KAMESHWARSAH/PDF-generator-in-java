/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */

/*
public class Create_PDF {
    
}

 */
package com.bethecoder.tutorials.itext.tests;

import com.itextpdf.text.BaseColor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Create_PDF {

    public Create_PDF() {
        super();
        initComponents();
        tab1();
    }

    /**
     * @param args
     * @throws DocumentException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException {

        //Create layout and set background
        Rectangle layout = new Rectangle(PageSize.A4);
//       layout.setBackgroundColor(BaseColor.WHITE);
//        java.awt.Image img = Toolkit.getDefaultToolkit().getImage("E:\\NetBeansProject\\PdfGenerate\\image\\plalnt.jpg");
        Document document = new Document(layout);
        PdfWriter.getInstance(document, new FileOutputStream("test1.pdf"));

        //Open the document before adding any content
        document.open();

        Paragraph paragraph = new Paragraph("PDF \n" + " ");
        document.add(paragraph);

        Paragraph paragraph1 = new Paragraph("Name :- Kameshwar Sah");
        document.add(paragraph1);
        //Close the document
        document.close();
    }

    public void tab1() {
        System.out.println("hello");
        JFrame f;
        // Table 
        JTable j;

        // Frame initiallization 
        f = new JFrame();

        // Frame Title 
        f.setTitle("JTable Example");

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Kundan Kumar Jha", "4031", "CSE"},
            {"Anand Jha", "6014", "IT"}
        };

        // Column Names 
        String[] columnNames = {"Name", "Roll Number", "Department"};

        // Initializing the JTable 
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size 
        f.setSize(500, 200);
        // Frame Visible = true 
        f.setVisible(true);
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
