import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class QuzzM {
    private List<Question> questions;
    public QuzzM(){
        questions=new ArrayList<>();
        questions.add(new Question("Java程序的执行过程中用到一套JDK工具，其中java.exe是指：",
                Arrays.asList("A.Java文档生成器"," B.Java解释器","C.Java编译器","D.Java类分解器"),
                Arrays.asList("B"),1,false));
        questions.add(new Question("Java嵌入式应用开发平台名称为:",
                Arrays.asList("A.JDK", "B.J2ME", "C.J2SE", "D.J2EE"),
                Arrays.asList("B"), 1,false));
        questions.add(new Question("下列数组定义及赋值，错误的是（  ）。",
                Arrays.asList("A.int a[]={1,2,3};", "B.int a[];", "C.a=new int[3];    a[1]=1;   a[2]=2;  a[3]=3;", "D.int a[][]=new int[3][];  a[0]=new int[2];  a[1]=new int[2];  a[2]=new int[2];"),
                Arrays.asList("C"), 1,false));
        questions.add(new Question("下面数据类型转换中，必须进行强制类型转换的是（  ）。",
                Arrays.asList("A.byte->int;", "B.int->char;", "C.short->float;", "D.float->double;"),
                Arrays.asList("B"), 1,false));
        questions.add(new Question("以下标识符中（  ）是不合法的。",
                Arrays.asList("A._small", "B.Big", "C.$12ab", "D.7hello"),
                Arrays.asList("D"), 1,false));
        questions.add(new Question("下面赋值语句不会产生编译错误或警告的是（  ）。",
                Arrays.asList("A.char a=’abc’ ;", "B.byte b=145;", "C.float c=3.14;", "D.int i=12;"),
                Arrays.asList("D"), 1,false));
        questions.add(new Question("下列语句执行后，i、j的值是（   ）。\n" +
                "int i=0,j=10;\n" +
                "do{ if(i++>--j) break;}\n" +
                "   while(true);",
                Arrays.asList("A.i=6，j=4", "B.i=6，j=5", "C.i=5，j=5", "D.i=5，j=4"),
                Arrays.asList("A"), 1,false));
        questions.add(new Question("JAVA语言中控制结构包括（   ）。",
                Arrays.asList("A.顺序结构、选择结构、循环结构", "B.顺序结构、循环结构", "C.顺序结构、选择结构", "D.选择结构、循环结构"),
                Arrays.asList("A"), 1,false));
        questions.add(new Question("若a是int型变量，表达式a=(int)(25.8/3%3);执行后a的值为（   ）。",
                Arrays.asList("A.1", "B.2", "C.3", "D.4"),
                Arrays.asList("B"), 1,false));
        questions.add(new Question("构造方法不能被继承。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("A"), 3,false));
        questions.add(new Question("一个子类可以重新定义从父类那里继承来的同名方法，而且允许它们有不同的返回值类型。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("this和super都可以在main()方法中使用",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("StringBuffer类型的字符串的内容可以被修改。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("A"), 3,false));
        questions.add(new Question("StringBuilder是线程安全的",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("StringBuffer是线程安全的",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("A"), 3,false));
        questions.add(new Question("为了实现复杂的界面布局，JFrame的内容区可以设置多个Layout。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("快捷键是为了提升效率而设，菜单项一定要设置快捷键。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("助记符是为了提升效率而设，菜单项一定要设置助记符。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("String类型的字符串的内容可以通过String对象的方法replace(char oldChar, char newChar)修改。",
                Arrays.asList("A.正确", "B.错误"),
                Arrays.asList("B"), 3,false));
        questions.add(new Question("Java中的基本数据类型是哪些？",
                Arrays.asList("A.int", "B.float", "C.char", "D.boolean"),
                Arrays.asList("ABCD"), 2,false));
        questions.add(new Question("下列哪些操作符是Java中的位运算符？",
                Arrays.asList("A.&", "B.|", "C.^", "D.~"),
                Arrays.asList("ABCD"), 2,false));
        questions.add(new Question("关于Java中的异常处理，以下哪些说法是正确的？",
                Arrays.asList("A.可以捕获多个异常类型", "B.catch块可以没有参数", "C.finally块必须出现在catch块之后", "D.可以使用throws关键字声明方法可能抛出的异常"),
                Arrays.asList("ABD"), 2,false));
        questions.add(new Question("Java中的哪些集合类实现了List接口？",
                Arrays.asList("A.ArrayList", "B.HashSet", "C.LinkedList", "D.TreeMap"),
                Arrays.asList("AC"), 2,false));
        questions.add(new Question("下列哪些说法是关于Java中的线程安全的集合类的？",
                Arrays.asList("A.ConcurrentHashMap是线程安全的", "B.ArrayList是线程安全的", "C.Vector是线程安全的", "D.HashMap是线程安全的"),
                Arrays.asList("AC"), 2,false));
        questions.add(new Question("Java中的注解（Annotation）有哪些用途？",
                Arrays.asList("A.提供编译时检查", "B.提供运行时信息", "C.可以用于创建自定义标记", "D.用于定义类的结构"),
                Arrays.asList("ABC"), 2,false));
        questions.add(new Question("Java中的IO操作中，哪些类是字符流类？",
                Arrays.asList("A.FileInputStream", "B.InputStreamReader", "C.FileReader", "D.BufferedWriter"),
                Arrays.asList("BC"), 2,false));
        questions.add(new Question("关于Java中的反射，以下哪些说法是正确的？",
                Arrays.asList("A.可以在运行时获取类的信息", "B.可以动态创建类的实例", "C.可以访问私有成员", "D.可以调用私有方法"),
                Arrays.asList("ABCD"), 2,false));
        questions.add(new Question("Java中的Lambda表达式有哪些特性？",
                Arrays.asList("A.可以替代匿名内部类", "B.可以用于函数式接口", "C.可以引用外部变量", "D.可以包含多条语句"),
                Arrays.asList("ABC"), 2,false));
        questions.add(new Question("Java中的哪些关键字用于线程同步？",
                Arrays.asList("A.synchronized", "B.volatile", "C.lock", "D.await"),
                Arrays.asList("AB"), 2,false));
    }
    public List<Question> getRondomQuestion(){
        List<Question> randomQuestions = new ArrayList<>();

        // 随机选择5道单选题
        randomQuestions.addAll(selectRandomQuestions(1, 5));

        // 随机选择5道多选题
        randomQuestions.addAll(selectRandomQuestions(2, 5));

        // 随机选择5道判断题
        randomQuestions.addAll(selectRandomQuestions(3, 5));
        Collections.shuffle(randomQuestions);
        return randomQuestions;
    }
    private List<Question> selectRandomQuestions(int tag, int count) {
        List<Question> selectedQuestions = new ArrayList<>();
        List<Question> filteredQuestions = new ArrayList<>();

        Collections.shuffle(questions);
        // 过滤指定标签的题目
        for (Question question : questions) {
            if (question.getType() == tag) {
                filteredQuestions.add(question);
            }
        }
        // 打乱题目顺序
        Collections.shuffle(filteredQuestions);
        // 选择指定数量的题目
        for (int i = 0; i < Math.min(count, filteredQuestions.size()); i++) {
            selectedQuestions.add(filteredQuestions.get(i));
        }
        return selectedQuestions;
    }
}
