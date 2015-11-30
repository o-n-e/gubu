var gubuApp = angular.module('gubuApp', ['ngResource']);

gubuApp.controller('MomentController', function ($scope, $resource) {

    $scope.dates = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31];

        $scope.months = [
        'Jan',
        'Feb',
        'Mar',
        'Apr',
        'May',
        'Jun',
        'Jul',
        'Aug',
        'Sep',
        'Oct',
        'Nov',
        'Dec',
    ];

    $scope.years = [2015, 2016, 2017, 2018, 2019, 2020];

    $scope.hours = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24];

    $scope.minutes = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
        30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59];

    $scope.injectionSites = [
        'Right Stomach',
        'Left Stomach',
        'Right Arm',
        'Left Arm',
        'Right Thigh',
        'Left Thigh',
        'Right Calf',
        'Left Calf',
        'Right Buttock',
        'Left Buttock',
        'Other'
    ];

    $scope.entryTypes = [
        'Before Breakfast',
        'Before Lunch',
        'Before Dinner',
        'Other',
        'Before Excercise',
        'Hypo',
        'Snack',
        'Correctional',
        'Before Driving',
        'Background Insulin',
        'During Excercise',
        'During Night',
        'After Breakfast',
        'After Lunch',
        'After Dinner',
        'Before Supper',
        'After Supper',
        'Illness',
        'Fasting',
        'Hypo Check',
        'Waking',
    ];

    $scope.saveMoment = function() {
        $scope.moment.userId = 1;
        var MomentToSave = $resource('/service/gubu/moment/');
        MomentToSave.save($scope.moment);
    }

});