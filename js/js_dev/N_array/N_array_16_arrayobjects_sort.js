var person = [
    {
        firstName: "ramu",
        lastName: "test",
        age: 23,
        weight: 45.9
    },
    {
        firstName: "mohan",
        lastName: "a",
        age: 22,
        weight: 49.9
    },
    {
        firstName: "pavan",
        lastName: "p",
        age: 21,
        weight: 55.9
    },
    {
        firstName: "murali",
        lastName: "m",
        age: 20,
        weight: 65.9
    },
    ]
    function test() {
        var str = '';
        for(var i = 0 ; i < person.length ; i++) {
            str += person[i].firstName + ", " + person[i].lastName + ", " + person[i].age + ", " + person[i].weight + "<br>"; 
        }
        document.getElementById('p1').innerHTML = str;
    }
    /**
     * fucntion sort1 : sort by age
    */
    /**
     * string mthod for the sorting
     * function sort1() {
        person.sort(function(a,b) {
            return a.firstName.localeCompare(b.firstName);
        });
        test();
    }
     */
    function sort1() {
       person.sort(function(a,b){
            if (a.firstName > b.firstName) return 1;
            else if (a.firstName < b.firstName) return -1;
            else return 0;
       });
       test();
    }