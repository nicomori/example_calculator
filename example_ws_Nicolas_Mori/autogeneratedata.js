module.exports = function () {
    var faker = require("faker");
    var _ = require("lodash");
    return {
        post: _.times(20, function (n) {
            return {
                userId: n,
                id: n,
                title: faker.name.title(),
                email: faker.internet.email(),
                body: faker.name.jobDescriptor()
            }
        })
    }
}