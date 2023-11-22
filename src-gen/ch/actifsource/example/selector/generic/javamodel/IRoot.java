package ch.actifsource.example.selector.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoot extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("aca13aab-27ea-11eb-a5fe-13a4cfefee49");
  
  public java.lang.Integer selectInteger();
  
  public java.lang.Long selectLong();
  
  public java.lang.Double selectDouble();
  
  public java.lang.Boolean selectBoolean();
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IA> selectRoot_a();
  
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IB> selectRoot_b();
  
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IC> selectRoot_c();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,aca13aab-27ea-11eb-a5fe-13a4cfefee49,tV1MZ2VfU6HtAGBpfFTk0QAVf5A=] */
