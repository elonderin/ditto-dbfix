package de.tomsit.ditto.fixdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@lombok.Data
@Entity(name = "Data")
public class Data {

  @Id
  @Column(name = "lID")
  long id;
  @Column(name = "lParentID")
  long lParentID;
  @Column(name = "strClipBoardFormat", columnDefinition = "TEXT")
  String clipBoardFormat;
  @Column(name = "ooData", columnDefinition = "CLOB")
  String data;

}
