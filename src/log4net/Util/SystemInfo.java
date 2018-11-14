package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.Reflection.*;
import jio.System.*;
import jio.System.Collections.*;public class SystemInfo {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static java.lang.String getNewLine (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("NewLine");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getApplicationBaseDirectory (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("ApplicationBaseDirectory");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getConfigurationFileLocation (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("ConfigurationFileLocation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getEntryAssemblyLocation (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("EntryAssemblyLocation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.Integer getCurrentThreadId (){ try { return Javonet.getType("SystemInfo").get("CurrentThreadId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public static java.lang.String getHostName (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("HostName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getApplicationFriendlyName (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("ApplicationFriendlyName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.util.Date getProcessStartTime (){ try { return Javonet.getType("SystemInfo").get("ProcessStartTime");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public static void setNullText (java.lang.String value){ try { Javonet.getType("SystemInfo").set("NullText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static java.lang.String getNullText (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("NullText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public static void setNotAvailableText (java.lang.String value){ try { Javonet.getType("SystemInfo").set("NotAvailableText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static java.lang.String getNotAvailableText (){ try { return  (java.lang.String) Javonet.getType("SystemInfo").get("NotAvailableText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetFiled
	 */
            public static Class[] getEmptyTypes (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("SystemInfo").get("EmptyTypes"),Class[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setEmptyTypes (Class[] param){ try { Javonet.getType("SystemInfo").set("EmptyTypes",new Object[] {param});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SystemInfo(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.String AssemblyLocationInfo (Assembly myAssembly){ try { return  (java.lang.String) Javonet.getType("SystemInfo").invoke("AssemblyLocationInfo",myAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String AssemblyQualifiedName (Class type){ try { return  (java.lang.String) Javonet.getType("SystemInfo").invoke("AssemblyQualifiedName",Javonet.getType(getReturnObjectName(type).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String AssemblyShortName (Assembly myAssembly){ try { return  (java.lang.String) Javonet.getType("SystemInfo").invoke("AssemblyShortName",myAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String AssemblyFileName (Assembly myAssembly){ try { return  (java.lang.String) Javonet.getType("SystemInfo").invoke("AssemblyFileName",myAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static Class GetTypeFromString (Class relativeType,java.lang.String typeName,java.lang.Boolean throwOnError,java.lang.Boolean ignoreCase){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("SystemInfo").invoke("GetTypeFromString",Javonet.getType(getReturnObjectName(relativeType).getTypeName()),typeName,throwOnError,ignoreCase));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static Class GetTypeFromString (java.lang.String typeName,java.lang.Boolean throwOnError,java.lang.Boolean ignoreCase){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("SystemInfo").invoke("GetTypeFromString",typeName,throwOnError,ignoreCase));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static Class GetTypeFromString (Assembly relativeAssembly,java.lang.String typeName,java.lang.Boolean throwOnError,java.lang.Boolean ignoreCase){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("SystemInfo").invoke("GetTypeFromString",relativeAssembly,typeName,throwOnError,ignoreCase));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static Guid NewGuid (){ try { return Javonet.getType("SystemInfo").invoke("NewGuid");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ArgumentOutOfRangeException CreateArgumentOutOfRangeException (java.lang.String parameterName,NObject actualValue,java.lang.String message){ try { return new ArgumentOutOfRangeException((NObject)Javonet.getType("SystemInfo").invoke("CreateArgumentOutOfRangeException",parameterName,actualValue,message));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Boolean TryParse (java.lang.String s,AtomicReference<java.lang.Integer> val){ try { return Javonet.getType("SystemInfo").invoke("TryParse",s,new NOut(val, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean TryParse (java.lang.String s,AtomicReference<java.lang.Long> val){ try { return Javonet.getType("SystemInfo").invoke("TryParse",s,new NOut(val, Helper.JavaToDotnetType.get(java.lang.Long.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.String GetAppSetting (java.lang.String key){ try { return  (java.lang.String) Javonet.getType("SystemInfo").invoke("GetAppSetting",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String ConvertToFullPath (java.lang.String path){ try { return  (java.lang.String) Javonet.getType("SystemInfo").invoke("ConvertToFullPath",path);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static Hashtable CreateCaseInsensitiveHashtable (){ try { return new Hashtable((NObject)Javonet.getType("SystemInfo").invoke("CreateCaseInsensitiveHashtable"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}