package com.example.app;

public class ModelClass {
  public ModelClass(int imageResoruce, String title, String body) {
    this.imageResoruce = imageResoruce;
    this.title = title;
    this.body = body;
  }

  private  int imageResoruce;
  private  String title;
  private   String body;

  public int getImageResoruce() {
    return imageResoruce;
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }




}
