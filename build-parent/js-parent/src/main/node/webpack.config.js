const path = require("path");

module.exports = {
	mode:   "production",
	entry:  "${project.build.directory}/generated-sources/uglified/app.js",
	output: {
		path:     path.resolve(__dirname, "${project.build.directory}/dist/js"),
		filename: "app.js"
	}
};
