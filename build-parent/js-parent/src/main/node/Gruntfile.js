module.exports = function (grunt) {
	// Project configuration
	grunt.initConfig({
						 pkg   : grunt.file.readJSON("package.json"),
						 tslint: {
							 options: {
								 configuration: "tslint.json",
								 force        : false,
								 fix          : true
							 },
							 files  : {
								 src: [
									 "${project.build.sourceDirectory}/**/*.ts"
								 ]
							 }
						 },
						 ts    : {
							 options: {
								 rootDir: "${project.build.sourceDirectory}"
							 },
							 main   : {
								 tsconfig: true,
								 src     : "${project.build.sourceDirectory}/**/*.ts",
								 dest    : "${project.build.directory}/generated-sources/ts-compiled"
							 }
						 },
						 uglify: {
							 options: {
								 sourceMap: true
							 },
							 main   : {
								 files: [
									 {
										 expand: true,
										 cwd   : "${project.build.directory}/generated-sources/ts-compiled",
										 src   : "**/*.js",
										 dest  : "${project.build.directory}/generated-sources/uglified",
										 ext   : ".min.js"
									 }
								 ]
							 }
						 }
					 });

	// Load plugins
	grunt.loadNpmTasks("grunt-tslint");
	grunt.loadNpmTasks("grunt-ts");
	grunt.loadNpmTasks("grunt-contrib-uglify");

	// Default task(s)
	grunt.registerTask("default", [
		"tslint",
		"ts",
		"uglify"
	]);
};
