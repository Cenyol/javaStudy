### 一些笔记

先来个定义：模板方法，定义了算法骨架，将骨架中的部分方法延迟到子类中进行实现。

钩子：被安插在算法框架的某些特定的步骤之中，并且在子类需要的情况下，由子类自己看心情实现。比较常见的模板方法钩子我是在Android的Activity和Service等的生命周期过程中，经常有一些init、start、stop和destroy等方法，这些就是钩子。