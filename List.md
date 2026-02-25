

# `IntList`

> 目的：
> 实现列表构建，相对数组可以实现size的改变

模仿数组的连续存储不符合列表功能设置中的size的crud功能，故考虑分散排布，利用存储指针来实现列表的逻辑上的连续。

## 初探

实现整数的储存与size的改变，初步list的定义

**设计**
```java
public class IntList{
  /** 实现数据储存 */
  public int first；
  /** rest指向下一个IntList ,实现分散化数据储存 */
  public IntList rest; 
}
```