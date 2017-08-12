package com.org.v141_to_142.Java_8_From_PermGen_to_Metaspace_PART2;

//Set the below in VM arguments to simulate java.lang.OutOfMemoryError: Metaspace
//-XX:MaxMetaspaceSize=10m

public class MetaSpaceOOMSimulator {
	static ClassPool classPool = ClassPool.getDefault();

	public static void main(String[] args) throws CannotCompileException,
			RuntimeException {
		for (int i = 0; i < 100000; i++) {
			Class<?> class1 = classPool.makeClass(
					"com.infotech.client.MetaSpaceOOMSimulator:" + i).toClass();
			System.out.println(class1.getName());
		}
	}
}
