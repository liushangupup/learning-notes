# python函数定义
在 Python 中，函数是通过 `def` 关键字定义的。函数可以接受参数，并且可以返回值。以下是函数定义的基本语法：

```python
def function_name(parameters):
    """Docstring (optional): A brief description of the function."""
    # Function body
    # Perform some operations
    return value  # (optional)
```

### 示例

#### 无参数和返回值的函数

```python
def greet():
    """Prints a greeting message."""
    print("Hello, World!")

greet()  # 调用函数，输出：Hello, World!
```

#### 带参数的函数

```python
def greet(name):
    """Prints a personalized greeting message."""
    print(f"Hello, {name}!")

greet("Alice")  # 调用函数，输出：Hello, Alice!
```

#### 带返回值的函数

```python
def add(a, b):
    """Returns the sum of two numbers."""
    return a + b

result = add(3, 5)  # 调用函数，并将返回值赋给变量 result
print(result)  # 输出：8
```

#### 带默认参数的函数

```python
def greet(name="World"):
    """Prints a greeting message with a default name."""
    print(f"Hello, {name}!")

greet()  # 调用函数，输出：Hello, World!
greet("Alice")  # 调用函数，输出：Hello, Alice!
```

#### 带可变数量参数的函数

```python
def greet(*names):
    """Prints a greeting message for each name provided."""
    for name in names:
        print(f"Hello, {name}!")

greet("Alice", "Bob", "Charlie")  # 调用函数，输出：Hello, Alice! Hello, Bob! Hello, Charlie!
```

#### 带关键字参数的函数

```python
def display_info(**info):
    """Displays information provided as keyword arguments."""
    for key, value in info.items():
        print(f"{key}: {value}")

display_info(name="Alice", age=30, city="New York")
# 调用函数，输出：
# name: Alice
# age: 30
# city: New York
```

### 带类型注解的函数

虽然 Python 是动态类型语言，但你可以使用类型注解来指定函数参数和返回值的类型，以提高代码的可读性和维护性。

```python
def add(a: int, b: int) -> int:
    """Returns the sum of two integers."""
    return a + b

result = add(3, 5)
print(result)  # 输出：8
```

### Lambda 表达式

Python 还支持使用 `lambda` 关键字定义匿名函数（也称为 lambda 函数）。这些函数通常用于需要简短函数的情景，如排序或过滤。

```python
# 定义一个 lambda 函数来计算两个数的和
add = lambda a, b: a + b

result = add(3, 5)
print(result)  # 输出：8
```

通过这些示例，你应该能够掌握如何在 Python 中定义和使用函数。函数是组织和重用代码的基本构建块，理解它们的定义和使用对编写高效、可维护的代码非常重要。