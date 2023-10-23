print("Name : Sumit Panchal\nEnrolment No :20C22024") 
class Perceptron:
    def __init__(self,x1,weights):
        self.x1=x1 
        self.weights=weights
        self.a,self.b=self.perceptron(x1,weights)
    def perceptron(self,inputs,weights,bias=0): 
        sum1=0 
        for i in range(0,len(inputs)):
            sum1+=inputs[i]*weights[i]
        return self.step(sum1+bias),sum1
    def step(self,value):
        if value>0.5:
            return 1
        return 0
    def __str__(self):
        return f"{self.a,self.b}"
x1=[0.4,0.2,0.7] 
weights=[0.25,0.4,0.2] 
obj = Perceptron(x1,weights)
print(obj)
