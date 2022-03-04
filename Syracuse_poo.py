class Syracuse:
    def __init__(self):
        pass
        with open("./number.txt", "r") as file:
            number =file.read()
        self.u = int(number )

    def syracuse_(self):
        f = open('Syracude_de_'+str(self.u)+'.txt','w')
        iter =0
        while(self.u!=1):
            iter +=1
            if self.u%2==0: 
                self.u = self.u//2
                
            else:
               self. u = 3*self.u+1
            print(self.u)
            f.write(str(self.u )+', ')
        print(iter," : iterations")    
        return self.u

x = Syracuse()
x.syracuse_()


