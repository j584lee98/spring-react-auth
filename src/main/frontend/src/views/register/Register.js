import React from "react";

export default () => {
  return (
    <div>
      <form id="register-form" action="/register" method="POST">
        <div>
          <div>Username:</div>
          <input id="username" type="text" name="userName" />
        </div>
        <div>
          <div>Password:</div>
          <input id="password" type="password" name="password" />
        </div>
        <input type="submit" value="Submit" />
      </form>
    </div>
  );
};
