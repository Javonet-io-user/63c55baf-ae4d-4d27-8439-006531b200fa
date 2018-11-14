package log4net.Util.TypeConverters;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import log4net.Util.TypeConverters.*;public class ConversionNotSupportedException extends ApplicationException {protected NObject javonetHandle; public ConversionNotSupportedException (){  super((NObject) null); try {  javonetHandle = Javonet.New("ConversionNotSupportedException"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConversionNotSupportedException (java.lang.String message){  super((NObject) null); try {  javonetHandle = Javonet.New("ConversionNotSupportedException",message); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConversionNotSupportedException (java.lang.String message,jio.System.Exception innerException){  super((NObject) null); try {  javonetHandle = Javonet.New("ConversionNotSupportedException",message,innerException); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConversionNotSupportedException(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static ConversionNotSupportedException Create (Class destinationType,NObject sourceValue){ try { return new ConversionNotSupportedException((NObject)Javonet.getType("ConversionNotSupportedException").invoke("Create",Javonet.getType(getReturnObjectName(destinationType).getTypeName()),sourceValue));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ConversionNotSupportedException Create (Class destinationType,NObject sourceValue,jio.System.Exception innerException){ try { return new ConversionNotSupportedException((NObject)Javonet.getType("ConversionNotSupportedException").invoke("Create",Javonet.getType(getReturnObjectName(destinationType).getTypeName()),sourceValue,innerException));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}