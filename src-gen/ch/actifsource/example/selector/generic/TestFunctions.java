package ch.actifsource.example.selector.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[22796da3-2806-11eb-a44c-e5ce7752bfd4,imports]] */

/* End Protected Region   [[22796da3-2806-11eb-a44c-e5ce7752bfd4,imports]] */

public class TestFunctions {

  /* Begin Protected Region [[22796da3-2806-11eb-a44c-e5ce7752bfd4]] */
  
  /* End Protected Region   [[22796da3-2806-11eb-a44c-e5ce7752bfd4]] */


  public static interface IRootFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("29c0ad62-2806-11eb-a44c-e5ce7752bfd4")
    public List<ch.actifsource.core.javamodel.INamedResource> getSublist();

  }
  
  public static interface IRootFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RootFunctionsImpl implements IRootFunctionsImpl {

    public static final IRootFunctionsImpl INSTANCE = new RootFunctionsImpl();

    private RootFunctionsImpl() {}

  }
  
  public static class RootFunctions {

    private RootFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,22796da3-2806-11eb-a44c-e5ce7752bfd4,PG4FhgfKsi+UsFJ4nu2IFhdvD0U=] */
