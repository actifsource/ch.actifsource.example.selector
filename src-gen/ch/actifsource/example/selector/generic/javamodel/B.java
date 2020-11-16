package ch.actifsource.example.selector.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class B extends DynamicResource implements IB {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IB> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IB>() {
    
    @Override
    public IB create() {
      return new B();
    }
    
    @Override
    public IB create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new B(resourceRepository, resource);
    }
  
  };

  public B() {
    super(IB.TYPE_ID);
  }
  
  public B(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IB.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IC> selectC() {
    return _getList(ch.actifsource.example.selector.generic.javamodel.IC.class, ch.actifsource.example.selector.generic.GenericPackage.B_c);
  }

  public B setC(java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IC> c) {
    _setList(ch.actifsource.example.selector.generic.GenericPackage.B_c, c);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public B setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.selector.generic.javamodel.IC.class, ch.actifsource.example.selector.generic.GenericPackage.B_c, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.selector.generic.javamodel.IB> selectToMeC(ch.actifsource.example.selector.generic.javamodel.IC object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.selector.generic.javamodel.IB.class, ch.actifsource.example.selector.generic.GenericPackage.B_c, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a5a00466-27ea-11eb-a5fe-13a4cfefee49,YAIX0wdzgP9LJS2iHcPRgKf+yf4=] */
