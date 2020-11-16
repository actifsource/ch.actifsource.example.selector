package ch.actifsource.example.selector.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Root extends DynamicResource implements IRoot {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot>() {
    
    @Override
    public IRoot create() {
      return new Root();
    }
    
    @Override
    public IRoot create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Root(resourceRepository, resource);
    }
  
  };

  public Root() {
    super(IRoot.TYPE_ID);
  }
  
  public Root(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoot.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IA> selectRoot_a() {
    return _getList(ch.actifsource.example.selector.generic.javamodel.IA.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_a);
  }

  public Root setRoot_a(java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IA> root_a) {
    _setList(ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_a, root_a);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IB> selectRoot_b() {
    return _getList(ch.actifsource.example.selector.generic.javamodel.IB.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_b);
  }

  public Root setRoot_b(java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IB> root_b) {
    _setList(ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_b, root_b);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IC> selectRoot_c() {
    return _getList(ch.actifsource.example.selector.generic.javamodel.IC.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_c);
  }

  public Root setRoot_c(java.util.List<? extends ch.actifsource.example.selector.generic.javamodel.IC> root_c) {
    _setList(ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_c, root_c);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Root setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.selector.generic.javamodel.IA.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_a, visitor);
    _acceptList(ch.actifsource.example.selector.generic.javamodel.IB.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_b, visitor);
    _acceptList(ch.actifsource.example.selector.generic.javamodel.IC.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_c, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.selector.generic.javamodel.IRoot selectToMeRoot_a(ch.actifsource.example.selector.generic.javamodel.IA object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.selector.generic.javamodel.IRoot.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_a, object.getResource());
  }
  
  public static ch.actifsource.example.selector.generic.javamodel.IRoot selectToMeRoot_b(ch.actifsource.example.selector.generic.javamodel.IB object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.selector.generic.javamodel.IRoot.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_b, object.getResource());
  }
  
  public static ch.actifsource.example.selector.generic.javamodel.IRoot selectToMeRoot_c(ch.actifsource.example.selector.generic.javamodel.IC object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.selector.generic.javamodel.IRoot.class, ch.actifsource.example.selector.generic.GenericPackage.Root_root_aE_c, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aca13aab-27ea-11eb-a5fe-13a4cfefee49,aDk0xvCL30AadBNg4fieL60Yh2A=] */
