package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import jio.System.Data.*;
import log4net.Core.*;
import log4net.Layout.*;public class AdoNetAppenderParameter {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParameterName (java.lang.String value){ try { javonetHandle.set("ParameterName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getParameterName (){ try { return  (java.lang.String) javonetHandle.get("ParameterName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDbType (DbType value){ try { javonetHandle.set("DbType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbType getDbType (){ try { return DbType.valueOf(((NEnum) javonetHandle.get("DbType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrecision (java.lang.Byte value){ try { javonetHandle.set("Precision",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getPrecision (){ try { return javonetHandle.get("Precision");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setScale (java.lang.Byte value){ try { javonetHandle.set("Scale",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getScale (){ try { return javonetHandle.get("Scale");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setSize (java.lang.Integer value){ try { javonetHandle.set("Size",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getSize (){ try { return javonetHandle.get("Size");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setLayout (IRawLayout value){ try { javonetHandle.set("Layout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IRawLayout getLayout (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Layout"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public AdoNetAppenderParameter (){ try {  javonetHandle = Javonet.New("AdoNetAppenderParameter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AdoNetAppenderParameter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Prepare (IDbCommand command){ try { javonetHandle.invoke("Prepare",command);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FormatValue (IDbCommand command,LoggingEvent loggingEvent){ try { javonetHandle.invoke("FormatValue",command,loggingEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}