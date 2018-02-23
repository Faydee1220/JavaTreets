package com.teamtreehouse;

import java.util.Date;
import java.io.Serializable;

public class Treet implements Comparable, Serializable {
  private boolean isBreak = true;
  
  //serialver com.teamtreehouse.Treet  
  private static final long serialVersionUID = 1683283589599506518L;  
  
  private String author;
  private String description;
  private Date creationDate;
  
  public Treet(String author, String description, Date creationDate) {
    this.author = author;
    this.description = description;
    this.creationDate = creationDate;
  }
  
  @Override
  public String toString() {
    return String.format("Treet: \"%s\" by @%s on %s", description, author, creationDate);
  }
  
  public String[] getWords() {
    return description.toLowerCase().split("[^\\w#@']+");
  }
  
  // 為了能夠比較 Treet class，在最上方 class 後方 implements Comparable，並覆寫 compareTo 方法
  @Override
  public int compareTo(Object obj) {
    Treet other = (Treet) obj;
    // 相同時回傳 0
    if (equals(obj)) {
      return 0;
    }
    int dateCmp = creationDate.compareTo(other.creationDate);
    // 當日期相同時，進一步檢查描述是否也相同
    if (dateCmp == 0) {
      return description.compareTo(other.description);
    }
    return dateCmp;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public String getDescription() {
    return description;
  }
  
  public Date getCreationDate() {
    return creationDate;
  }
  
  
}