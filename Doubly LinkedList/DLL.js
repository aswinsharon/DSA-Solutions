class Node{
  constructor(data){
    this.data=data;
    this.prev=null;
    this.next=null;
  }
}
class DoublyLinkedList{
  constructor(){
    this.head=null;
    this.tail=null;
    this.length=0;
  }
  

  insertAt(index,value){

    const newNode = new Node(value);
    if(index == 0){
      this.prepend(value);
       return this;
    }
    if(index >= this.length){
      this.append(value);
       return this;
    }
    else{
      const leader = this.traversetoIndex(index-1);
      const replace = leader.next;
      leader.next = newNode;
      newNode.prev = leader;
      newNode.next = replace;
      replace.prev = newNode;
      this.length++
      return this
    }
  }

  prepend(value){
    
    const newNode = new Node(value);
    newNode.next = this.head;
    this.head.prev = newNode;
    this.head = newNode;
    this.length++;
    return this;
  
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

  append(value){

    const newNode = new Node(value);
    if(this.head == null){
      this.head = newNode;
      this.tail = newNode;
      this.length++;
    }
    else{
    this.tail.next = newNode;
    newNode.prev = this.tail;
    this.tail = newNode;
    this.length++;
    }
    return this;
    
  }

  remove(index){
    
    if(index == this.length-1){
      const leader = this.traversetoIndex(index-1);
      const victim = leader.next;
      leader.next = null;
      this.tail = leader;
      this.length--;
      return this;
    }
    if(index == 0){
      const replace = this.head.next;
      this.head = replace;
      this.length--;
      return this;
    }
    else{
    const leader = this.traversetoIndex(index-1);
    const victim = leader.next;
    const follower = victim.next;
    leader.next = follower;
    follower.prev = leader;
    this.length--;
    return this;
    }
  }
  
  print(){
    var array=[];
    var current=this.head;
    while(current!=null){
      array.push(current.data);
      current=current.next;
    }
    console.log("size :",this.length)
    return array;
  }
}


var list = new DoublyLinkedList();

list.append(0);
list.insertAt(0,20);
list.insertAt(2,29);
list.insertAt(0,"cache")
list.prepend(",e")
list.remove(0);
list.remove(0)
list.remove(0)
list.remove(0)
list.insertAt(0,400)
list.remove(1)
console.log(list.print())