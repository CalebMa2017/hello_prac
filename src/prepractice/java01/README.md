#泛型
##泛型类
定义泛型类`Generic<T>`  
根据常识可知`Integer`是`Number`的子类  
如果用`Generic<Number>`定义形式参数，传入实参`Generic<Integer>`
则会报错，所以应该用`Generic<?>`定义形式参数
> **注意**：此处`?`是类型实参，而不是类型形参
##泛型方法

