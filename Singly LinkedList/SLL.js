class Node{
  constructor(data){
    this.data=data;
    this.next=null;
  }
}

class LinkedList{
    constructor(){
    this.head=null;
    this.tail=this.head;
    this.length=0;
  }

  append(value){
    var node=new Node(value);
    if(this.head==null){
      this.head=node;
      this.tail=node;
      this.length++;
      return this;
    }
    else{
      this.tail.next=node;
      this.tail=node;
      this.length++;
      return this;
    }
  }
  
  prepend(value){
     var node =  new Node(value);
     node.next = this.head;
     this.head =  node;
     this.length++;
     return this;
   }
  
  insertAt(index,value){
   if(index > this.length){
     console.log("Out of bound")
   }
   var node=new Node(value);
   if(index <= 0){
     this.prepend(value);
   }
   else if(index >= this.length){
     this.append(value);
   }
   else{
     const leader=this.traversetoIndex(index-1);
     var replace=leader.next;
     leader.next=node;
     node.next=replace;
     this.length++;
     return this;
   }
 }
  
  traversetoIndex(index){
    var counter=0;
    var current=this.head;
    while(counter !== index){
      current=current.next;
      counter++;
    }
    return current;
  }
  
  remove(index){
     if(index>this.length)
    if(index == 0){
      this.head=this.head.next;
    }
    else{
    var leader=this.traversetoIndex(index-1);
    var victim=leader.next;
    leader.next=victim.next;
    }
    this.length--;
    return this;
  }
  
  print(){
    var current=this.head;

    const array=[];  //to make output as array instead of object
    while(current!=null){
      array.push(current.data);
      current=current.next;
    }
    console.log("size :",this.length)
    return array;
  }


 reverse(){
   if(this.length == 1){
     return this.head;
   }
   else{
   var first = this.head;
   var second = first.next;
   this.tail = this.head;
   while(second){

     const temp = second.next;
     second.next = first;
     first = second;
     second = temp;
  
   }
    this.head.next= null;
    this.head = first;
    return this;
   }
}
}
const List=new LinkedList();
List.append(0);
List.append(0);
List.append(100);
List.append(3)
List.reverse()
console.log(List.print())