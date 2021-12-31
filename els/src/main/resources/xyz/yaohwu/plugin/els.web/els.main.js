;
window.ELS = window.ELS || {};

$.extend(ELS, {
    Hello: {
        sayHello: function () {
            console.log('hello');
        }
    }
});
$(function () {
    ELS.Hello.sayHello();
});