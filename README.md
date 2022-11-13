# Decorator Pattern Example

This is an example of the [Decorator Pattern](https://en.wikipedia.org/wiki/Decorator_pattern)

### Example Scenario
There is a `Publisher` that can publish some info via Mail.
Now, stakeholders would like to publish the info to Twitter, as well.
And then to Instagram.
And then to Facebook.

They want to call 1 publisher for this. And they want to have the combined time required to sent the message returned in the log, too.


### How to Build
#### Prerequisites
Have Java installed

#### Build
Open the terminal on the root project and call

```
javac -d ./bin/ src/*.java
```

### How to Run
After you've built the project, call

```
java -cp ./bin/ Main
```

### Output
```
Published as mail: Hello World! (10ms total)
     - sending message to Twitter: Hello World!
Published to Twitter (60ms total)
     - sending message to Instagram: Hello World!
Published to Insta (160ms total)
     - sending message to facebook...
Published to Facebook (310ms total)
```
