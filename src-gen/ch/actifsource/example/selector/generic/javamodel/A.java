package ch.actifsource.example.selector.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class A extends DynamicResource implements IA {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IA> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IA>() {
    
    @Override
    public IA create() {
      return new A();
    }
    
    @Override
    public IA create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new A(resourceRepository, resource);
    }
  
  };

  public A() {
    super(IA.TYPE_ID);
  }
  
  public A(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IA.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IB> selectB() {
    return _getList(ch.actifsource.example.selector.generic.javamodel.IB.class, ch.actifsource.example.selector.generic.GenericPackage.A_b);
  }

  public A setB(java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IB> b) {
    _setList(ch.actifsource.example.selector.generic.GenericPackage.A_b, b);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public A setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.selector.generic.javamodel.IB.class, ch.actifsource.example.selector.generic.GenericPackage.A_b, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.selector.generic.javamodel.IA> selectToMeB(ch.actifsource.example.selector.generic.javamodel.IB object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.selector.generic.javamodel.IA.class, ch.actifsource.example.selector.generic.GenericPackage.A_b, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a3ce7861-27ea-11eb-a5fe-13a4cfefee49,kMX03vp97yVeL2XdT752jqjd+Wg=] */
