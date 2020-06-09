from flask import Flask, request, redirect, jsonify
from Student import *

app = Flask(__name__)

listStudents = set()

@app.route('/students', methods=['GET'])
def students():
    return jsonify(students=[a.serialize() for a in listStudents])

@app.route('/addStudent', methods=['POST'])
def add():
    try:
        listStudents.add(Student(request.get_json()))
        return jsonify(students=[a.serialize() for a in listStudents])
    except Exception as error:
        return jsonify(error=str(error))

if __name__ == '__main__':
    app.run(debug=True)