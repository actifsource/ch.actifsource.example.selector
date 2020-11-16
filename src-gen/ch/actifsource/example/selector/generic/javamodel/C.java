package ch.actifsource.example.selector.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class C extends DynamicResource implements IC {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IC> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IC>() {
    
    @Override
    public IC create() {
      return new C();
    }
    
    @Override
    public IC create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new C(resourceRepository, resource);
    }
  
  };

  public C() {
    super(IC.TYPE_ID);
  }
  
  public C(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IC.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectBooleanLiteral() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.selector.generic.GenericPackage.C_booleanLiteral);
  }
    
  public void setBooleanLiteral(java.lang.Boolean booleanLiteral) {
     _setSingleAttribute(ch.actifsource.example.selector.generic.GenericPackage.C_booleanLiteral, booleanLiteral);
  }

  @Override
  public java.lang.Double selectDoubleLiteral() {
    return _getSingleAttribute(java.lang.Double.class, ch.actifsource.example.selector.generic.GenericPackage.C_doubleLiteral);
  }
    
  public void setDoubleLiteral(java.lang.Double doubleLiteral) {
     _setSingleAttribute(ch.actifsource.example.selector.generic.GenericPackage.C_doubleLiteral, doubleLiteral);
  }

  @Override
  public java.lang.Integer selectIntegerLiteral() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.example.selector.generic.GenericPackage.C_integerLiteral);
  }
    
  public void setIntegerLiteral(java.lang.Integer integerLiteral) {
     _setSingleAttribute(ch.actifsource.example.selector.generic.GenericPackage.C_integerLiteral, integerLiteral);
  }

  @Override
  public java.lang.Long selectLongLiteral() {
    return _getSingleAttribute(java.lang.Long.class, ch.actifsource.example.selector.generic.GenericPackage.C_longLiteral);
  }
    
  public void setLongLiteral(java.lang.Long longLiteral) {
     _setSingleAttribute(ch.actifsource.example.selector.generic.GenericPackage.C_longLiteral, longLiteral);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public C setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.selector.generic.GenericPackage.C_booleanLiteral, visitor);
    _acceptSingleAttribute(java.lang.Double.class, ch.actifsource.example.selector.generic.GenericPackage.C_doubleLiteral, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.example.selector.generic.GenericPackage.C_integerLiteral, visitor);
    _acceptSingleAttribute(java.lang.Long.class, ch.actifsource.example.selector.generic.GenericPackage.C_longLiteral, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a7570382-27ea-11eb-a5fe-13a4cfefee49,qNW4Ma7k663NgciKGmEW+onBbFE=] */
