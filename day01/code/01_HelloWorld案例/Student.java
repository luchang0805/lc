//注释：用于解释说明程序的文字
/*
	注释的分类：
		单行注释 一般用于解释说明单行程序 
			格式是：//注释文字
		多行注释 一般用于解释说明多行程序
			格式是：
		文档注释 一般是对类或者方法进行说明，被javadoc工具解析生产一个文档说明书。
			格式是：
*/

//注意：多行注释不能嵌套写，而单行注释可以。

//这是我的学生案例
//class是java中用来定义类的
//定义类的格式是：class 类名

/*
	这是我的学生案例
	class是java中用来定义类的
	定义类的格式是：class 类名
*/

/**  */
class Student {
	public static void main(String[] args) {
		System.out.println("我是学生");
		
		System.out.println("第一次修改");
	}
}