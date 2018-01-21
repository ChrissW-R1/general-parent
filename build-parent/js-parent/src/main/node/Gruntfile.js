module.exports = function (grunt) {
	// Project configuration
	grunt.initConfig({
						 pkg   : grunt.file.readJSON("package.json"),
						 clean : {
							 target: ["target/**"]
						 },
						 ts    : {
							 options: {
								 rootDir: "src/main/ts"
							 },
							 main   : {
								 tsconfig: true,
								 src     : "src/main/ts/**/*.ts",
								 dest    : "target/generated-sources/ts-compiled"
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
										 cwd   : "target/generated-sources/ts-compiled",
										 src   : "**/*.js",
										 dest  : "target/generated-sources/uglified",
										 ext   : ".min.js"
									 }
								 ]
							 }
						 }
					 });

	// Load plugins
	grunt.loadNpmTasks("grunt-contrib-clean");
	grunt.loadNpmTasks("grunt-ts");
	grunt.loadNpmTasks("grunt-contrib-uglify");

	// Default task(s)
	grunt.registerTask("default", [
		"clean",
		"ts",
		"uglify"
	]);
};
