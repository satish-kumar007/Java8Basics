package practice.java8.lambdavsinnerclasses;
/*
Inner classes can never re-placed by lambda expression
Reason 1: Anonymous inner class extends the concrete class.
class Test{ Test t1=nre Test(){}}
Reason 2: Anonymous inner class extends abstract classes.
Reason 3: Anonymous inner class can implement an interface that contains multiple methods.
Reason 4: Anonymous inner class can implement an interface that contains single method.

But lambda expression can't do so. Here we can achieve only reason 4 using lambda.
 */
public class LambdaVsInnerClasses_3 {
}
