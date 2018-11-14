package log4net.Util.TypeConverters;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.TypeConverters.*;
import jio.System.*;public class ConverterRegistry {protected NObject javonetHandle; public ConverterRegistry(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void AddConverter (Class destinationType,NObject converter){ try { Javonet.getType("ConverterRegistry").invoke("AddConverter",Javonet.getType(getReturnObjectName(destinationType).getTypeName()),converter);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void AddConverter (Class destinationType,Class converterType){ try { Javonet.getType("ConverterRegistry").invoke("AddConverter",Javonet.getType(getReturnObjectName(destinationType).getTypeName()),Javonet.getType(getReturnObjectName(converterType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static IConvertTo GetConvertTo (Class sourceType,Class destinationType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("ConverterRegistry").invoke("GetConvertTo",Javonet.getType(getReturnObjectName(sourceType).getTypeName()),Javonet.getType(getReturnObjectName(destinationType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static IConvertFrom GetConvertFrom (Class destinationType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("ConverterRegistry").invoke("GetConvertFrom",Javonet.getType(getReturnObjectName(destinationType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}