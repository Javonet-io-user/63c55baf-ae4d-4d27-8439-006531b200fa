package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.*;public class SecurityContextProvider {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public static void setDefaultProvider (SecurityContextProvider value){ try { Javonet.getType("SecurityContextProvider").set("DefaultProvider",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static SecurityContextProvider getDefaultProvider (){ try { return new SecurityContextProvider((NObject)Javonet.getType("SecurityContextProvider").get("DefaultProvider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SecurityContextProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public SecurityContext CreateSecurityContext (NObject consumer){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreateSecurityContext",consumer));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}