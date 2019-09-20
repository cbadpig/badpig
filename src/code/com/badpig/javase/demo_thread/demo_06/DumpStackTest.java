package code.com.badpig.javase.demo_thread.demo_06;

public class DumpStackTest {
    public void a() {
        b();
    }
    public void b() {
        c();
    }
    public void c() {
        d();
    }
    public void d() {
        e();
    }
    public void e() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < elements.length; i++) {
            StackTraceElement element = elements[i];
            System.out.println("className:"+ element.getClassName() +",methoudName:"+ element.getMethodName() +",fileName:"+ element.getFileName() +",lineNumber:" + element.getLineNumber());
            //System.out.println("ClassLoaderName:"+ element.getClassLoaderName() +",ModuleName:"+ element.getModuleName() +",ModuleVersion:"+ element.getModuleVersion() );
        }
    }

    public static void main(String[] args) {

    }
}
