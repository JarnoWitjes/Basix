.class public HelloWorld
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 15
.limit locals 1

ldc 0
istore 0
begin1:
iload 0
ldc 4
if_icmplt true1
goto endif1
true1:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "HELO!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 0
ldc 1
iadd
istore 0
goto begin1
endif1:
  return
.end method
