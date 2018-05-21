/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

let app = function(){
    console.log("LOADED!!");
    return {
        search : function(){
            const inputSearch = document.getElementById("txtSearch");
            console.log(inputSearch.value);
        }
    };
}();
