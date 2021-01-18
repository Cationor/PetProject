$(document).ready(function() {
    dateInputs();
});

function formattedDate(date, options) {
    return date.toLocaleString('ru', options).split('.').reverse().join('-');
}

function getDepartureDate(date) {
    return new Date(date.setFullYear(
        date.getFullYear(),
        date.getMonth(),
        date.getDate()
    ));
}

function dateInputs() {
    let dateInputs = $('.form-control--date');
    let optionsFormattedDate = {
        year: 'numeric',
        month: 'numeric',
        day: 'numeric'
    };
    let dateNow = new Date();
    dateNow.setDate(dateNow.getDate() + 1);

    dateInputs.each(function () {
        let currentItem = $(this);

        if (currentItem.attr('name') === 'date_to') {
            let defaultDepartureDate = getDepartureDate(dateNow);
            let formattedDepartureDate = formattedDate(defaultDepartureDate, optionsFormattedDate);

            currentItem.attr('min', formattedDepartureDate);
            if (currentItem.value < formattedDepartureDate) {
                currentItem.val(formattedDepartureDate);
            }
        } else {
            let defaultArrivalDate = formattedDate(dateNow, optionsFormattedDate);

            currentItem.attr('min', defaultArrivalDate);
            if (currentItem.value <= defaultArrivalDate) {
                currentItem.val(defaultArrivalDate);
            }
        }
    });

    dateInputs.on('change', function () {
        let inputName = $(this).attr('name');
        let value = $(this).val();

        if (inputName === 'date_from') {
            let departureInput = $('.form-control--date[name="date_to"]');
            let arrivalDate = new Date(value);
            let departureNextDate = getDepartureDate(arrivalDate);
            let formattedDepartureNextDate = formattedDate(departureNextDate, optionsFormattedDate);

            departureInput.attr('min', formattedDepartureNextDate);
            if (departureInput.value < formattedDepartureNextDate) {
                departureInput.val(formattedDepartureNextDate);
            }
        } else {
            return false;
        }
    });
}

function checkPasses(){
    let pass = document.getElementById("pass");
    let confpass = document.getElementById("passConf");

    if (pass.value !== confpass.value){
        $("#pass").css("border", "2px solid red");
        $("#passConf").css("border", "2px solid red");
        $("#not_valid").css("display", "block");
    }
    if (pass.value === confpass.value){
        if (pass.value !== '') {
            $("#pass").css("border", "2px solid green");
            $("#passConf").css("border", "2px solid green");
            $("#not_valid").css("display", "none");
        }else {
            $("#pass").css("border", "none");
            $("#passConf").css("border", "none");
            $("#not_valid").css("display", "none");
        }
    }
}


