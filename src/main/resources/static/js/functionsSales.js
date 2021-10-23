//Time Functions

function showHour() {
    var today = new Date();
    var hour = today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
    document.getElementById("currentTime").value = hour;
    setTimeout("showHour()", 1000)
}

showDate();
function showDate() {
    var today = new Date();
    var date = today.getDate() + ' / ' + (today.getMonth() + 1) + ' / ' + today.getFullYear();

    document.getElementById("currentDate").value = date;
}

//Forms Data


function completeUser() {
    var idUser = document.getElementById("selectUser").value;
    var userName = document.getElementById("selectUser").selectedOptions[0].text;
    document.getElementById("idUser").value = idUser;
    console.log(idUser)
}

function completeClient() {
    var idClient = document.getElementById("selectCliente").value;
    var nameClient = document.getElementById("selectCliente").selectedOptions[0].text;
    document.getElementById("inputIdClient").value = idClient;
    document.getElementById("name_client").value = nameClient;
    console.log(idClient)
    console.log(nameClient)

}

// PRODUCT 1 ROW
function completeProduct1() {
    var productCode = document.getElementById("selectProduct1").value;
    var product1 = products.find(item => item.idCode == productCode);
    console.log(productCode)
    console.log(product1)
    document.getElementById("inputProduct1").value = productCode;
    document.getElementById("price_sale1").value = product1.priceProduct;
    totalValueWithoutIVA1();

}

//SubTotal row without IVA
function totalValueWithoutIVA1() {
    let unitValue = document.getElementById("price_sale1").value;
    let quantity = document.getElementById("quantityProduct1").value;
    document.getElementById("price_withoutIVA1").value = unitValue * quantity;
    valueSubTotalWithoutIVA();

}


//PRODUCT 2 ROW

function completeProduct2() {
    var productCode = document.getElementById("selectProduct2").value;
    var product2 = products.find(item => item.idCode == productCode);
    console.log(productCode)
    console.log(product2)
    document.getElementById("inputProduct2").value = productCode;
    document.getElementById("price_sale2").value = product2.priceProduct;
    totalValueWithoutIVA2();


}

//SubTotal row without IVA
function totalValueWithoutIVA2() {
    let unitValue = document.getElementById("price_sale2").value;
    let quantity = document.getElementById("quantityProduct2").value;
    document.getElementById("price_withoutIVA2").value = unitValue * quantity;
    valueSubTotalWithoutIVA();

}

//PRODUCT 3 ROW

function completeProduct3() {
    var productCode = document.getElementById("selectProduct3").value;
    var product3 = products.find(item => item.idCode == productCode);
    console.log(productCode)
    console.log(product3)
    document.getElementById("inputProduct3").value = productCode;
    document.getElementById("price_sale3").value = product3.priceProduct;
    totalValueWithoutIVA1();

}

//SubTotal row without IVA
function totalValueWithoutIVA3() {
    let unitValue = document.getElementById("price_sale3").value;
    let quantity = document.getElementById("quantityProduct3").value;
    document.getElementById("price_withoutIVA3").value = unitValue * quantity;
    valueSubTotalWithoutIVA();

}



//Suma subtotal rows
function valueSubTotalWithoutIVA() {
    let value1 = isNaN(parseInt(document.getElementById("price_withoutIVA1").value)) ? 0 : parseInt(document.getElementById("price_withoutIVA1").value);
    let value2 = isNaN(parseInt(document.getElementById("price_withoutIVA2").value)) ? 0 : parseInt(document.getElementById("price_withoutIVA2").value);
    let value3 = isNaN(parseInt(document.getElementById("price_withoutIVA3").value)) ? 0 : parseInt(document.getElementById("price_withoutIVA3").value);
    document.getElementById("inputSubTotalNotIVA").value = value1 + value2 + value3;

    totalIVA()
    totalInvoice()
    mapDataTotals()


}

// total value IVA
function totalIVA() {
    let IVA = 0.19;
    let subtotalNotIVA = isNaN(parseInt(document.getElementById("inputSubTotalNotIVA").value)) ? 0 : parseInt(document.getElementById("inputSubTotalNotIVA").value);
    document.getElementById("inputTotalIVA").value = subtotalNotIVA * IVA;

}

// Total value Invoice
function totalInvoice() {
    let subtotal = isNaN(parseInt(document.getElementById("inputSubTotalNotIVA").value)) ? 0 : parseInt(document.getElementById("inputSubTotalNotIVA").value);
    let totalIVA = isNaN(parseInt(document.getElementById("inputTotalIVA").value)) ? 0 : parseInt(document.getElementById("inputTotalIVA").value);
    document.getElementById("inputGrandTotal").value = subtotal + totalIVA;
}


// fill fields
function mapDataTotals() {
    let totalIVA = isNaN(parseInt(document.getElementById("inputTotalIVA").value)) ? 0 : parseInt(document.getElementById("inputTotalIVA").value);
    let totalInvoice = isNaN(parseInt(document.getElementById("inputGrandTotal").value)) ? 0 : parseInt(document.getElementById("inputGrandTotal").value);

    document.getElementById("datoValorIVA").value = totalIVA;
    document.getElementById("datoValorFactura").value = totalInvoice;

}

//Clean Fields

function deleteRow1() {
    document.getElementById("inputProduct1").value = 0;
    document.getElementById("selectProduct1").value = 0;
    document.getElementById("price_sale1").value = "";
    document.getElementById("quantityProduct1").value = "";
    document.getElementById("price_withoutIVA1").value = "";
}

function deleteRow2() {
    document.getElementById("inputProduct2").value = 0;
    document.getElementById("selectProduct2").value = 0;
    document.getElementById("price_sale2").value = "";
    document.getElementById("quantityProduct2").value = "";
    document.getElementById("price_withoutIVA2").value = "";
}


function deleteRow3() {
    document.getElementById("inputProduct3").value = 0;
    document.getElementById("selectProduct3").value = 0;
    document.getElementById("price_sale3").value = "";
    document.getElementById("quantityProduct3").value = "";
    document.getElementById("price_withoutIVA3").value = "";
}


// NUEVA FUNCION
function selectRole() {
    var idrolUser = document.getElementById("inputId").value;
    var rolUserName = document.getElementById("selectRol").selectedOptions[0].text;
    document.getElementById("inputIdRolUser").value = idrolUser;
    document.getElementById("inputRolUserName").value = rolUserName;
    console.log(rolUserName);
    console.log(idrolUser);

}

