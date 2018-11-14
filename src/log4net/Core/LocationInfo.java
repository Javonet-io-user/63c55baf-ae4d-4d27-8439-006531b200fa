package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.*;public class LocationInfo {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getClassName (){ try { return  (java.lang.String) javonetHandle.get("ClassName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getLineNumber (){ try { return  (java.lang.String) javonetHandle.get("LineNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getMethodName (){ try { return  (java.lang.String) javonetHandle.get("MethodName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getFullInfo (){ try { return  (java.lang.String) javonetHandle.get("FullInfo");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public LocationInfo (Class callerStackBoundaryDeclaringType){ try {  javonetHandle = Javonet.New("LocationInfo",Javonet.getType(getReturnObjectName(callerStackBoundaryDeclaringType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LocationInfo (java.lang.String className,java.lang.String methodName,java.lang.String fileName,java.lang.String lineNumber){ try {  javonetHandle = Javonet.New("LocationInfo",className,methodName,fileName,lineNumber);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LocationInfo(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}