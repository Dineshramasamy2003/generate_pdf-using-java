package pdf_create;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.*;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class table_pdf {
	public static void add(Document document,String val,String val2) {
		//
		float[] col= {150F,450f};
		PdfPTable tab=new PdfPTable(col);
		tab.setWidthPercentage(100f);
		
		PdfPCell r1=new PdfPCell();
		r1.setPhrase(new Phrase("Q1  "+"("+val+")"));
		r1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		r1.setPaddingLeft(40);
		r1.setPaddingBottom(5);
		tab.addCell(r1);
		
		PdfPCell r11=new PdfPCell();
		r11.setPhrase(new Phrase(val2));
		r11.setBackgroundColor(BaseColor.LIGHT_GRAY);
		r11.setPaddingLeft(30);
		r11.setPaddingBottom(5);
		tab.addCell(r11);
		
		//
		float[] c= {150F,50F,67f,67f,67f,50f,50f,100f};
		PdfPTable dataTable=new PdfPTable(c);
		dataTable.setWidthPercentage(100f);
		// Fonts
		Font uniFont = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 12, BaseColor.BLACK);
		Font schoolFont = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 12, BaseColor.BLACK); // black looks better on green


		// ---------- Row 1: University Group ----------
		PdfPCell uniCell = new PdfPCell(new Phrase("University group", uniFont));
		uniCell.setBackgroundColor(BaseColor.CYAN);
		uniCell.setBorder(PdfPCell.NO_BORDER); 
		uniCell.setPadding(5);
		dataTable.addCell(uniCell);
		
		PdfPCell p1 = new PdfPCell(new Phrase("150"));
		p1.disableBorderSide(PdfPCell.BOTTOM); 
		p1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		p1.setPadding(5);
		dataTable.addCell(p1);
		PdfPCell num1 = new PdfPCell(new Phrase("73"));
		num1.setPaddingLeft(20);
		dataTable.addCell(num1);
		PdfPCell num2 = new PdfPCell(new Phrase("7"));
		num2.setPaddingLeft(20);
		dataTable.addCell(num2);
		PdfPCell num3 = new PdfPCell(new Phrase("20"));
		num3.setPaddingLeft(20);
		dataTable.addCell(num3);
		PdfPCell p11 = new PdfPCell(new Phrase("0.9"));
		p11.disableBorderSide(PdfPCell.BOTTOM); 
		p11.setPaddingLeft(15);
		p11.setPaddingTop(10);
		dataTable.addCell(p11);
		PdfPCell p111 = new PdfPCell(new Phrase("4"));
		p111.disableBorderSide(PdfPCell.BOTTOM); 
		p111.setPaddingLeft(15);
		p111.setPaddingTop(10);
		dataTable.addCell(p111);
		PdfPCell p0 = new PdfPCell(new Phrase("ns"));
		p0.disableBorderSide(PdfPCell.BOTTOM); 
		p0.setPaddingLeft(30);
		p0.setPaddingTop(10);
		dataTable.addCell(p0);

		// ---------- Row 2: School Group ----------
		PdfPCell schoolCell = new PdfPCell(new Phrase("School group", schoolFont));
		schoolCell.setBackgroundColor(BaseColor.GREEN);
		schoolCell.setBorder(PdfPCell.NO_BORDER);
		schoolCell.setPadding(5);
		dataTable.addCell(schoolCell);
		
		PdfPCell p2 = new PdfPCell(new Phrase("150"));
		p2.disableBorderSide(PdfPCell.TOP);
		p2.setBackgroundColor(BaseColor.LIGHT_GRAY);
		p2.setPadding(5);
		dataTable.addCell(p2);
		PdfPCell num11 = new PdfPCell(new Phrase("73"));
		num11.setPaddingLeft(20);
		dataTable.addCell(num11);
		PdfPCell num22 = new PdfPCell(new Phrase("7"));
		num22.setPaddingLeft(20);
		dataTable.addCell(num22);
		PdfPCell num33 = new PdfPCell(new Phrase("20"));
		num33.setPaddingLeft(20);
		dataTable.addCell(num33);
		PdfPCell p22 = new PdfPCell(new Phrase(""));
		p22.disableBorderSide(PdfPCell.TOP); 
		dataTable.addCell(p22);
		dataTable.addCell(p22);
		dataTable.addCell(p22);
		try {
			document.add(tab);
			document.add(dataTable);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
	private static final String location="D:/";
	private static final String fileLocation="Table.pdf";
	
	public static void main(String[] args) {
		Document document=new Document();
		try {
		
			
			PdfWriter.getInstance(document,new FileOutputStream(new File(location+fileLocation)));
			document.open();
			Font font = FontFactory.getFont(FontFactory.TIMES_BOLD, 13, BaseColor.BLACK);
			
			float[] columns= {150F,50F,200F,200F};
			PdfPTable table=new PdfPTable(columns);
			table.setWidthPercentage(100f);
			
			PdfPCell cell1=new PdfPCell();
			cell1.setPhrase(new Phrase(""));
			table.addCell(cell1);
			
			PdfPCell cell2=new PdfPCell();
			cell2.setPhrase(new Phrase(""));
			cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell2);
			
			PdfPCell cell3=new PdfPCell();
			cell3.setPhrase(new Phrase("%",font));
			cell3.setPaddingLeft(80);
			cell3.setPaddingBottom(5);
			table.addCell(cell3);
			
			PdfPCell cell4=new PdfPCell();
			cell4.setPhrase(new Phrase("Comparisions",font));
			cell4.setPaddingLeft(50);
			cell4.setPaddingBottom(5);
			table.addCell(cell4);
			
			//next row
			float[] columns1= {150F,50F,67f,67f,67f,50f,50f,100f};
			PdfPTable table2=new PdfPTable(columns1);
			table2.setWidthPercentage(100f);
			
			PdfPCell r1c1=new PdfPCell();
			r1c1.setPhrase(new Phrase("Group",font));
			r1c1.setPaddingLeft(50);
			r1c1.setPaddingBottom(5);
			r1c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table2.addCell(r1c1);
			
			PdfPCell r1c2=new PdfPCell();
			r1c2.setPhrase(new Phrase("N",font));
			r1c2.setPaddingLeft(15);
			r1c2.setPaddingBottom(5);
			r1c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table2.addCell(r1c2);
			
			PdfPCell r1c3=new PdfPCell();
			r1c3.setPhrase(new Phrase("positive",font));
			r1c3.setBackgroundColor(BaseColor.LIGHT_GRAY);
			r1c3.setPaddingLeft(5);
			r1c3.setPaddingBottom(5);
			table2.addCell(r1c3);
			PdfPCell r1c4=new PdfPCell();
			r1c4.setPhrase(new Phrase("neutral",font));
			r1c4.setBackgroundColor(BaseColor.LIGHT_GRAY);
			r1c4.setPaddingLeft(5);
			r1c4.setPaddingBottom(5);
			table2.addCell(r1c4);
			PdfPCell r1c5=new PdfPCell();
			r1c5.setPhrase(new Phrase("negative",font));
			r1c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
			r1c5.setPaddingLeft(5);
			r1c5.setPaddingBottom(5);
			table2.addCell(r1c5);
			
			PdfPCell r1c6=new PdfPCell();
			r1c6.setPhrase(new Phrase("x\u00B2",font));
			r1c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
			r1c6.setPaddingLeft(15);
			r1c6.setPaddingBottom(5);
			table2.addCell(r1c6);
			PdfPCell r1c7=new PdfPCell();
			r1c7.setPhrase(new Phrase("df",font));
			r1c7.setBackgroundColor(BaseColor.LIGHT_GRAY);
			r1c7.setPaddingLeft(15);
			r1c7.setPaddingBottom(5);
			table2.addCell(r1c7);
			PdfPCell r1c8=new PdfPCell();
			r1c8.setPhrase(new Phrase("p",font));
			r1c8.setBackgroundColor(BaseColor.LIGHT_GRAY);
			r1c8.setPaddingLeft(40);
			r1c8.setPaddingBottom(5);
			table2.addCell(r1c8);
			
			document.add(table);
			document.add(table2);
			
			String[] ans= {"a","b","c","d","e","f","g"};
			String[] ans2= {"I prefer to have written instructions for experiments",
					"Practical work helps my understanding of Physics topics",
					"Discussions in the laboratory enhance my understanding of the subject",
					"I felt confident in carrying out the experiments in Physice",
					"The experimental procedure was clearly explained in the instructions",
					"I was so confused in the laboratory tht I ended up following the instructions without understanding whatI was doing",
					"There was good linkage between experiments and the relevant theory"};
			for(int i=0;i<7;i++) {
				add(document,ans[i],ans2[i]);
			}
			
			
			
			
			document.close();
			System.out.println("Document is created");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
