package jio.System;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Globalization.*;
import jio.System.Runtime.Serialization.*;public class DateTime extends ValueType implements IComparable,IFormattable,IConvertible,ISerializable {protected NObject javonetHandle; public DateTime (java.lang.Long ticks){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",ticks); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Long ticks,DateTimeKind kind){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",ticks,NEnum.fromJavaEnum(kind)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,Calendar calendar){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,calendar); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,DateTimeKind kind){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,NEnum.fromJavaEnum(kind)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,Calendar calendar){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,calendar); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond,DateTimeKind kind){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond,NEnum.fromJavaEnum(kind)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond,Calendar calendar){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond,calendar); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond,Calendar calendar,DateTimeKind kind){  super((NObject) null); try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond,calendar,NEnum.fromJavaEnum(kind)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public NObject ToType (Class type,IFormatProvider provider){ try { return  (NObject) javonetHandle.invoke("ToType",Javonet.getType(getReturnObjectName(type).getTypeName()),provider);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}