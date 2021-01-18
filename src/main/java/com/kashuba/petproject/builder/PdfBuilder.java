package com.kashuba.petproject.builder;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.kashuba.petproject.model.entity.Policy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfBuilder {


    public static void createPdf(Policy policy) {
        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Policy.pdf"));
            document.open();
            document.add(new Paragraph("Property insurance contract"));
            document.add(new Paragraph(policy.getFirstName() + " " + policy.getSecondName() + ", hereinafter " +
                    "referred to as the insurer, has entered into an agreement, hereinafter the Agreement, " +
                    "with the company EIS|GROUP about the following"));
            document.add(new Paragraph("According to this contract, the Insurer undertakes upon the occurrence " +
                    "of one of the insured events stipulated in the contract that entailed the loss or damage of " +
                    "property of the '" + policy.getRegisteredObject() + "' type hereinafter referred to as the " +
                    "'Insured Property', pay compensation in the amount of " + policy.getSumInsured() + "  currency " +
                    "units such as '" + policy.getContractCurrency() + "'. Insurance works only in " +
                    policy.getInsuranceCoverageArea() + " and until " + policy.getTermOfValidity() + "."));
            document.close();
            writer.close();

        } catch (
                DocumentException | FileNotFoundException e) {
            System.out.println("The file was not found");
        }
    }
}
