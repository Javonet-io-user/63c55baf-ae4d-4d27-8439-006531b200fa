package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.*;
import jio.System.Collections.*;public class OptionConverter {protected NObject javonetHandle; public OptionConverter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Boolean ToBoolean (java.lang.String argValue,java.lang.Boolean defaultValue){ try { return Javonet.getType("OptionConverter").invoke("ToBoolean",argValue,defaultValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Long ToFileSize (java.lang.String argValue,java.lang.Long defaultValue){ try { return Javonet.getType("OptionConverter").invoke("ToFileSize",argValue,defaultValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NObject ConvertStringTo (Class target,java.lang.String txt){ try { return  (NObject) Javonet.getType("OptionConverter").invoke("ConvertStringTo",Javonet.getType(getReturnObjectName(target).getTypeName()),txt);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Boolean CanConvertTypeTo (Class sourceType,Class targetType){ try { return Javonet.getType("OptionConverter").invoke("CanConvertTypeTo",Javonet.getType(getReturnObjectName(sourceType).getTypeName()),Javonet.getType(getReturnObjectName(targetType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static NObject ConvertTypeTo (NObject sourceInstance,Class targetType){ try { return  (NObject) Javonet.getType("OptionConverter").invoke("ConvertTypeTo",sourceInstance,Javonet.getType(getReturnObjectName(targetType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NObject InstantiateByClassName (java.lang.String className,Class superClass,NObject defaultValue){ try { return  (NObject) Javonet.getType("OptionConverter").invoke("InstantiateByClassName",className,Javonet.getType(getReturnObjectName(superClass).getTypeName()),defaultValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.String SubstituteVariables (java.lang.String value,IDictionary props){ try { return  (java.lang.String) Javonet.getType("OptionConverter").invoke("SubstituteVariables",value,props);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}