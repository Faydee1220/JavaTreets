package com.teamtreehouse;

import java.io.*;

public class Treets {
  public static void save(Treet[] treets) {
    try (
    // FileOutputStream 初始化參數放 file name，副檔名 ser 代表 serialized
    FileOutputStream fileOutputStream = new FileOutputStream("treets.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    ) {
      objectOutputStream.writeObject(treets);
    }
    catch (IOException e) {
      System.out.println("Problem saving treets");
      e.printStackTrace();
    }
  }
  
  public static Treet[] load() {
    Treet[] treets = new Treet[0];
    
    // try-with-resources block will automatically close any streams that are opened
    try (
      FileInputStream fileInputStream = new FileInputStream("treets.ser");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    ) {
      treets = (Treet[]) objectInputStream.readObject();
    }
    catch (IOException e) {
      System.out.println("Error reading file");
      e.printStackTrace();
    }
    catch (ClassNotFoundException e) {
      System.out.println("Error loading treets");
      e.printStackTrace();
    }
    return treets;
  }
  
  
}