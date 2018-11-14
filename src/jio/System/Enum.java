package jio.System;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;public abstract class Enum extends ValueType implements IComparable,IFormattable,IConvertible {protected NObject javonetHandle; public Enum(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean ToBoolean (IFormatProvider provider){ try { return javonetHandle.invoke("ToBoolean",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Character ToChar (IFormatProvider provider){ try { return javonetHandle.invoke("ToChar",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Byte ToSByte (IFormatProvider provider){ try { return javonetHandle.invoke("ToSByte",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Byte ToByte (IFormatProvider provider){ try { return javonetHandle.invoke("ToByte",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Short ToInt16 (IFormatProvider provider){ try { return javonetHandle.invoke("ToInt16",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer ToUInt16 (IFormatProvider provider){ try { return javonetHandle.invoke("ToUInt16",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer ToInt32 (IFormatProvider provider){ try { return javonetHandle.invoke("ToInt32",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Long ToUInt32 (IFormatProvider provider){ try { return javonetHandle.invoke("ToUInt32",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Long ToInt64 (IFormatProvider provider){ try { return javonetHandle.invoke("ToInt64",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.math.BigInteger ToUInt64 (IFormatProvider provider){ try { return javonetHandle.invoke("ToUInt64",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Float ToSingle (IFormatProvider provider){ try { return javonetHandle.invoke("ToSingle",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Double ToDouble (IFormatProvider provider){ try { return javonetHandle.invoke("ToDouble",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * Method
	 */
            public java.math.BigDecimal ToDecimal (IFormatProvider provider){ try { return javonetHandle.invoke("ToDecimal",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.util.Date ToDateTime (IFormatProvider provider){ try { return javonetHandle.invoke("ToDateTime",provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject ToType (Class type,IFormatProvider provider){ try { return  (NObject) javonetHandle.invoke("ToType",Javonet.getType(getReturnObjectName(type).getTypeName()),provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}