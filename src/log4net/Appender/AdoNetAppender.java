package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import jio.System.Data.*;
import log4net.Core.*;public class AdoNetAppender extends BufferingAppenderSkeleton implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setConnectionString (java.lang.String value){ try { javonetHandle.set("ConnectionString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getConnectionString (){ try { return  (java.lang.String) javonetHandle.get("ConnectionString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setConnectionType (java.lang.String value){ try { javonetHandle.set("ConnectionType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getConnectionType (){ try { return  (java.lang.String) javonetHandle.get("ConnectionType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCommandText (java.lang.String value){ try { javonetHandle.set("CommandText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCommandText (){ try { return  (java.lang.String) javonetHandle.get("CommandText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCommandType (CommandType value){ try { javonetHandle.set("CommandType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CommandType getCommandType (){ try { return CommandType.valueOf(((NEnum) javonetHandle.get("CommandType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUseTransactions (java.lang.Boolean value){ try { javonetHandle.set("UseTransactions",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUseTransactions (){ try { return javonetHandle.get("UseTransactions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSecurityContext (SecurityContext value){ try { javonetHandle.set("SecurityContext",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SecurityContext getSecurityContext (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("SecurityContext"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setReconnectOnError (java.lang.Boolean value){ try { javonetHandle.set("ReconnectOnError",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getReconnectOnError (){ try { return javonetHandle.get("ReconnectOnError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public AdoNetAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("AdoNetAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AdoNetAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddParameter (AdoNetAppenderParameter parameter){ try { javonetHandle.invoke("AddParameter",parameter);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}